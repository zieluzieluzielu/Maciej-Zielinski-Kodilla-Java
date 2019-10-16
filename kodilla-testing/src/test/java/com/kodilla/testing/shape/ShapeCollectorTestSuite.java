package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of the shapes tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);

    }

    @Test
    //adding figure to collection
    public void testAddFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle.getShapeName(), shapeCollector.getFigure(0).getShapeName());
    }

    @Test
    //removing figure from collection
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);

    }
    @Test
    //getting figure(n) from collection
    public void testGetFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        // When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals(circle, retrievedFigure);
    }

}
