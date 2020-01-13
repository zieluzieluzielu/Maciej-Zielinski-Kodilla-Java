package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLogin(){
        Logger.getInstance().log("10.10.2019");
    }

    @Test
    public  void getLastLogin(){
        //Given
        //When
        String login =  Logger.getInstance().getLastLog();
        System.out.println("Last login: "+login);
        //Then
        Assert.assertEquals("10.10.2019",login);
    }
}
