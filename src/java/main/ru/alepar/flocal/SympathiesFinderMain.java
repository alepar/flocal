package ru.alepar.flocal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.alepar.flocal.http.FlocalClient;
import ru.alepar.flocal.users.ContainsUserInfoPageParser;
import ru.alepar.flocal.users.RegexpUserListPageParser;
import ru.alepar.flocal.users.UserInfoPageParser;
import ru.alepar.flocal.users.UserListPageParser;

import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Streams;

public class SympathiesFinderMain {

    private static final Logger log = LoggerFactory.getLogger(SympathiesFinderMain.class);

    public static void main(String[] args) throws Exception {
        log.info("started");

        Streams.intRange(1, 900).boxed().unordered().parallel()
                .flatMap(pageNo -> {
                    try {
                        final FlocalClient flocal = threadLocal.get();
                        final String page = flocal.getPage("/showmembers.php?Cat=&page=" + pageNo);
                        return userListPageParser.parse(page).parallelStream();
                    } finally {
                        final int curCount = doneCount.incrementAndGet();
                        System.out.print("l" + curCount + "\r");
                    }
                })
                .map(user -> {
                    final FlocalClient flocal = threadLocal.get();
                    try {
                        final String page = flocal.getPage("/showprofile.php?Cat=&User=" + URLEncoder.encode(user.name, "windows-1251"));
                        return userInfoPageParser.parse(user, page);
                    } catch (Exception e) {
                        log.error("error getting userinfo for " + user.name, e);
                    } finally {
                        final int curCount = doneCount.incrementAndGet();
                        System.out.print("u" + curCount + "\r");
                    }
                    return null;
                })
                .filter(userInfo -> userInfo != null && userInfo.sympathy)
                .forEach(userInfo -> log.warn("yay! {} !", userInfo.name));

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

    private final static UserInfoPageParser userInfoPageParser = new ContainsUserInfoPageParser();

}
