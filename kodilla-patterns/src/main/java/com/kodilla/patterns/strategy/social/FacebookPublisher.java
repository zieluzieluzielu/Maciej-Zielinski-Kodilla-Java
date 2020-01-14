package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    public String getAppName() {
        return "Facebook";
    }

    @Override
    public String share() {
        return "sharing post on "+getAppName();
    }
}
