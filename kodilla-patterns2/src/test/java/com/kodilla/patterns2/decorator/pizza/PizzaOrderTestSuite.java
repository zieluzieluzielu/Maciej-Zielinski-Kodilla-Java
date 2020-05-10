package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithCheeseOnionMeatSauceLargeGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseIngredientDecorator(theOrder);
        theOrder = new OnionIngredientDecorator(theOrder);
        theOrder = new MeatIngredientDecorator(theOrder);
        theOrder = new SauceDecorator(theOrder);
        theOrder = new LargePizzaDecorator(theOrder);
        //Order matters (size always at the end)

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(50),theCost);

    }

    @Test
    public void testPizzaOrderWithCheeseOnionMeatSauceLargeGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseIngredientDecorator(theOrder);
        theOrder = new OnionIngredientDecorator(theOrder);
        theOrder = new MeatIngredientDecorator(theOrder);
        theOrder = new SauceDecorator(theOrder);
        theOrder = new LargePizzaDecorator(theOrder);
        //Order matters (size always at the end)

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza order: mozarella, tomato sauce, additional cheese, onion, meat, sauce (size: LARGE)",description);

    }

    @Test
    public void testPizzaOrderWithMeatSmallGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatIngredientDecorator(theOrder);
        theOrder = new SmallPizzaDecorator(theOrder);
        //Order matters (size always at the end)

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(9.5),theCost);

    }

    @Test
    public void testPizzaOrderWithMeatSmallGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatIngredientDecorator(theOrder);
        theOrder = new SmallPizzaDecorator(theOrder);
        //Order matters (size always at the end)

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza order: mozarella, tomato sauce, meat (size: SMALL)",description);

    }
}