package ru.alepar.flocal;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.alepar.flocal.http.FlocalClient;
import ru.alepar.flocal.users.*;

import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SympathiesFinderMain {

    private static final Logger log = LoggerFactory.getLogger(SympathiesFinderMain.class);

    public static void main(String[] args) throws Exception {
        log.info("started");

        final ExecutorService executor = Executors.newFixedThreadPool(200);
        final List<Future<List<User>>> userFutures = Lists.newArrayList();
        for (int i=1; i<=900; i++) {
            userFutures.add(executor.submit(new UserListPageTask(i)));
        }

        final List<Future<UserInfo>> infoFutures = Lists.newArrayList();
        for (Future<List<User>> future : userFutures) {
            try {
                final List<User> sublist = future.get();
                for (User user : sublist) {
                    if (user.posts > 0) {
                        infoFutures.add(executor.submit(new UserInfoTask(user)));
                    }
                }
            } catch (Exception e) {
                log.error("caught exc in UserListPageTask", e);
            }
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
        log.info("executor done");

        for (Future<UserInfo> future : infoFutures) {
            try {
                final UserInfo user = future.get();
                if (user.sympathy) {
                    log.warn("yay! {} !", user.name);
                }
            } catch (Exception e) {
                log.error("caught exc in UserInfoTask", e);
            }
        }
    }

    private static final UserListPageParser userListPageParser = new RegexpUserListPageParser();
    private static final AtomicInteger doneCount = new AtomicInteger(0);
    private static final ThreadLocal<FlocalClient> threadLocal = new ThreadLocal<FlocalClient>() {
        @Override
        protected FlocalClient initialValue() {
            return FlocalClient.Factory.create();
        }
    };

    private static class UserListPageTask implements Callable<List<User>> {

        private final int pageNo;

        public UserListPageTask(int pageNo) {
            this.pageNo = pageNo;
        }

        @Override
        public List<User> call() throws Exception {
            try {
                final FlocalClient flocal = threadLocal.get();
                final String page = flocal.getPage("/showmembers.php?Cat=&page=" + pageNo);
                return userListPageParser.parse(page);
            } finally {
                final int curCount = doneCount.incrementAndGet();
                System.out.print("l" + curCount + "\r");
            }
        }

    }

    private final static UserInfoPageParser userInfoPageParser = new ContainsUserInfoPageParser();
    private static class UserInfoTask implements Callable<UserInfo> {
        private final User user;

        public UserInfoTask(User user) {
            this.user = user;
        }

        @Override
        public UserInfo call() throws Exception {
            try {
                final FlocalClient flocal = threadLocal.get();
                final String page = flocal.getPage("/showprofile.php?Cat=&User=" + URLEncoder.encode(user.name, "windows-1251"));
                return userInfoPageParser.parse(user, page);
            } finally {
                final int curCount = doneCount.incrementAndGet();
                System.out.print("u" + curCount + "\r");
            }
        }

    }
}
