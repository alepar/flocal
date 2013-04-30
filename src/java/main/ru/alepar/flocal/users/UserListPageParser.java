package ru.alepar.flocal.users;

import java.util.List;

public interface UserListPageParser {

    List<User> parse(String content);

}
