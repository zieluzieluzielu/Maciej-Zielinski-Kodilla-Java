package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMacBuilder() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("black")
                .ingredient("cheese")
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("pickles")
                .sauce("sweet and sour")
                .burgers(2)
                .build();

        System.out.println(bigmac);
        //when
        int countBurgers = bigmac.getBurgers();
        int countIngredients = bigmac.getIngredients().size();
        String bunType = bigmac.getBun();
        //then
        Assert.assertEquals(2, countBurgers);
        Assert.assertEquals(4, countIngredients);
        Assert.assertEquals("black", bunType);
        Assert.assertNotNull(bigmac.getSauce());

    }
}
