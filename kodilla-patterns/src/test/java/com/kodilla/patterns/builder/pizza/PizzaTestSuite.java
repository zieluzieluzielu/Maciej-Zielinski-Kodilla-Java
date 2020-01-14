package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {

    @Test
    public void testPizzaNew(){
        //given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .ingredient("Ham")
                .sauce("Spicy")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //when
        int howManyIngredients = pizza.getIngredients().size();
        //then
        Assert.assertEquals(3, howManyIngredients);
    }
}
