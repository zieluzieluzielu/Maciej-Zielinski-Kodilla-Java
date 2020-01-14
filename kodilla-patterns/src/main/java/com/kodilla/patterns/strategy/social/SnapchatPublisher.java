package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    public String getAppName() {
        return "Snapchat";
    }

    @Override
    public String share() {
        return "sharing post on "+getAppName();
    }
}
