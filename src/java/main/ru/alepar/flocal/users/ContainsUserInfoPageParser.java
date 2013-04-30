package ru.alepar.flocal.users;

public class ContainsUserInfoPageParser implements UserInfoPageParser {
    @Override
    public UserInfo parse(User user, String content) {
        return new UserInfo(user.name, content.contains("<td title=\"Dismiss sympathy for this user\">"));
    }
}
