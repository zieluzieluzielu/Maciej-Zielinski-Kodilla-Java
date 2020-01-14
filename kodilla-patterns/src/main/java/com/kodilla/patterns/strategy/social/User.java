package com.kodilla.patterns.strategy.social;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    User(String userName) {
        this.userName = userName;
    }

    public String sharePost(){
        return this.userName+" is "+socialPublisher.share();
    }

    public String getFavoriteApp(){
        return socialPublisher.getAppName();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
