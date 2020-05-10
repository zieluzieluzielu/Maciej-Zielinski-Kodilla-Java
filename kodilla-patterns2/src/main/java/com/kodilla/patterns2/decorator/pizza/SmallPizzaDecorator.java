package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;


public class SmallPizzaDecorator extends AbstractPizzaOrderDecorator {

    public SmallPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().multiply(new BigDecimal(0.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " (size: SMALL)";
    }

}
