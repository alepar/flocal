package ru.alepar.flocal.users;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpUserListPageParser implements UserListPageParser {

    private static final Pattern pattern = Pattern.compile("(?m)(?s)<tr[^>]*>.*?<td>.*?<a href=\"/showprofile[^>]*>\\s*(.*?)\\s*</a>.*?</td>.*?<td>.*?</td>.*?<td>.*?</td>.*?<td>\\s*(\\d+)\\s*</td>.*?<td>.*?</td>.*?<td>.*?</td>.*?<td>.*?</td>.*?</tr>");

    @Override
    public List<User> parse(String content) {
        final List<User> users = Lists.newArrayList();
        final Matcher matcher = pattern.matcher(content);

        while(matcher.find()) {
            users.add(new User(matcher.group(1), Integer.valueOf(matcher.group(2))));
        }

        return users;
    }
}
