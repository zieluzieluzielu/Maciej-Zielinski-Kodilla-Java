package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //given
        ShapeFactory factory = new ShapeFactory();
        //when
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //then
        Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());

    }

    @Test
    public void testFactorySquare() {
        //given
        ShapeFactory factory = new ShapeFactory();
        //when
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //then
        Assert.assertEquals(28.0, square.getCircumference(), 0);
        Assert.assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle() {
        //given
        ShapeFactory factory = new ShapeFactory();
        //when
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //then
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals("The long rectangle", rectangle.getName());
    }
}
