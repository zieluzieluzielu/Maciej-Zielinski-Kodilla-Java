package com.kodilla.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies(){
        //given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Homme");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //when
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: "+stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: "+johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: "+kodillaShouldBuy);

        //then
        Assert.assertEquals("[Conservative predictor] Buy debetures of XYZ",stevenShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ",johnShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy(){
        //given
        Customer steven = new IndividualCustomer("Steven Links");

        //when
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: "+stevenShouldBuy);
        steven.setBuyingStrategy(new AggresivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: "+stevenShouldBuy);

        //then
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ",stevenShouldBuy);


    }
}
