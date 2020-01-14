package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //given
        User mark = new YGeneration("mark_1990");
        User jenny = new Millenials("jenny_1982");
        User tommy = new ZGeneration("tommy_2003");

        //when
        String markShare = mark.sharePost();
        String jennyShare = jenny.sharePost();
        String tommyShare = tommy.sharePost();
        System.out.println(markShare);
        System.out.println(jennyShare);
        System.out.println(tommyShare);

        //then
        Assert.assertEquals(mark.getFavoriteApp(), "Facebook");
        Assert.assertEquals(jenny.getFavoriteApp(), "Twitter");
        Assert.assertEquals(tommy.getFavoriteApp(), "Snapchat");
        Assert.assertEquals(markShare, "mark_1990 is sharing post on Facebook");
        Assert.assertEquals(jennyShare, "jenny_1982 is Sharing post on Twitter");
        Assert.assertEquals(tommyShare, "tommy_2003 is sharing post on Snapchat");

    }

    @Test
    public void testIndividualSharingStrategy() {
        //given
        User mark = new YGeneration("mark_1990");
        //when
        String markShare = mark.sharePost();
        System.out.println(markShare);
        mark.setSocialPublisher(new SnapchatPublisher());
        markShare = mark.sharePost();
        System.out.println(markShare);

        //then
        Assert.assertEquals(mark.getFavoriteApp(), "Snapchat");
    }
}
