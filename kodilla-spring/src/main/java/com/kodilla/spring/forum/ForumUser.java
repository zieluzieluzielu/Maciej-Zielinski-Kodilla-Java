package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
