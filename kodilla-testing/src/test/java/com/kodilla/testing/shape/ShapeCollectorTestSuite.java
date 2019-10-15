package com.kodilla.testing.shape;

import org.junit.*;

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
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle.getShapeName(), shapeCollector.getFigure(0));
    }

    @Test
    //removing figure from collection
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(null, shapeCollector.getFigure(0));

    }
    @Test
    //getting figure(n) from collection
    public void testGetFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        // When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals(circle, retrievedFigure);
    }

}
