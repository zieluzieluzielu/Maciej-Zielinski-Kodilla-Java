package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    public String getAppName() {
        return "Twitter";
    }

    @Override
    public String share() {
        return "Sharing post on " + getAppName();
    }
}
