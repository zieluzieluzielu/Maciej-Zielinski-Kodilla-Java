package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawTestSuite {

    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Shape triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("Triangle", result);

    }

    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Shape circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("Circle", result);

    }
}
