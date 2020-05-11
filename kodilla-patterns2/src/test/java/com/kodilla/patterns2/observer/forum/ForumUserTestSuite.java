package com.kodilla.patterns2.observer.forum;

import static org.junit.Assert.*;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser alBundy = new ForumUser("Al Bundy");
        ForumUser tedBrown = new ForumUser("Ted Brown");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(alBundy);
        javaHelpForum.registerObserver(tedBrown);
        javaToolsForum.registerObserver(tedBrown);

        //When
        javaHelpForum.addPost("Test post");
        javaHelpForum.addPost("Test post");
        javaToolsForum.addPost("Test post");
        javaHelpForum.addPost("Test post");
        javaToolsForum.addPost("Test post");

        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,alBundy.getUpdateCount());
        assertEquals(5,tedBrown.getUpdateCount());

    }
}
