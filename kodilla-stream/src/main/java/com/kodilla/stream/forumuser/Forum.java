package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, 'M', LocalDate.of(1989, 12, 31), 10));
        forumUserList.add(new ForumUser(2, 'F', LocalDate.of(1993, 10, 23), 50));
        forumUserList.add(new ForumUser(3, 'M', LocalDate.of(1992, 05, 20), 3));
        forumUserList.add(new ForumUser(4, 'M', LocalDate.of(1970, 11, 13), 13));
        forumUserList.add(new ForumUser(5, 'M', LocalDate.of(1970, 11, 13), 0));
        forumUserList.add(new ForumUser(6, 'F', LocalDate.of(1970, 2, 1), 15));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
