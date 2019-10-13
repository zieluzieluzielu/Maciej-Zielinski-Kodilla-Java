package com.kodilla.testing.user;

public class SimpleUser {
    String userName;
    String realName;

    public SimpleUser(String userName, String realName){
        this.userName=userName;
        this.realName=realName;
    }

    public String getUsername(){
        return userName;
    }

    public String getRealName(){
        return realName;
    }
}
