package ru.alepar.flocal;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.alepar.flocal.http.FlocalClient;
import ru.alepar.flocal.users.*;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import static com.google.common.base.Predicates.notNull;

public class SympathiesFinderMain {

    private static final Logger log = LoggerFactory.getLogger(SympathiesFinderMain.class);

    public static void main(String[] args) throws Exception {
        log.info("started");

        final ListeningExecutorService executor = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(200));

        final List<Future<List<UserInfo>>> infoFutures = Lists.newArrayList();
        for (int i=1; i<=900; i++) {
            infoFutures.add(
                    Futures.transform(
                            executor.submit(new UserListPageTask(i)),
                            new UserInfoFunction()
                    ));

        }

        final FluentIterable<UserInfo> sympathies = FluentIterable
                .from(
                        Iterables.concat(
                                FluentIterable
                                        .from(infoFutures)
                                        .transform(MoreGuava.<List<UserInfo>>unwrapFuture())
                                        .filter(notNull())
                        ))
                .filter(new HasSympathy());


        for (UserInfo sympathy : sympathies) {
            log.warn("yay! {} !", sympathy.name);
        }

        executor.shutdown();
        log.info("done");
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
    private static class UserInfoFunction implements Function<List<User>, List<UserInfo>> {
        @Override
        public List<UserInfo> apply(java.util.List<User> input) {
                final FlocalClient flocal = threadLocal.get();
                final ArrayList<UserInfo> userInfos = Lists.newArrayList();
                for (User user : input) {
                    try {
                        final String page = flocal.getPage("/showprofile.php?Cat=&User=" + URLEncoder.encode(user.name, "windows-1251"));
                        userInfos.add(userInfoPageParser.parse(user, page));
                    } catch (Exception e) {
                        log.error("error getting userinfo for "+user.name, e);
                    } finally {
                        final int curCount = doneCount.incrementAndGet();
                        System.out.print("u" + curCount + "\r");
                    }
                }
                return userInfos;
        }
    }

    private static class HasSympathy implements Predicate<UserInfo> {
        @Override
        public boolean apply(UserInfo input) {
            return input.sympathy;
        }
    }
}
