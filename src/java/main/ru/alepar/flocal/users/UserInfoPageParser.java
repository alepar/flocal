package ru.alepar.flocal.users;

public interface UserInfoPageParser {

    UserInfo parse(User user, String content);

}
