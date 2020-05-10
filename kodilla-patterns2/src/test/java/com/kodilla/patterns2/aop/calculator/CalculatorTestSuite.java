package com.kodilla.patterns2.aop.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd() {
        //Given
        //When
        double result = calculator.add(10, 15);

        //Then
        LOGGER.info("Testing add method");
        assertEquals(25, result, 0);
    }

    @Test
    public void testSubstract() {
        //Given
        //When
        double result = calculator.substract(10, 15);

        //Then
        LOGGER.info("Testing substract method");
        assertEquals(-5, result, 0);
    }

    @Test
    public void testMultiply() {
        //Given
        //When
        double result = calculator.multiply(10, 15);

        //Then
        LOGGER.info("Testing multiply method");
        assertEquals(150, result, 0);
    }

    @Test
    public void testDivide() {
        //Given
        //When
        double result = calculator.divide(15, 5);

        //Then
        LOGGER.info("Testing divide method");
        assertEquals(3, result, 0);
    }

    @Test
    public void testFactorial() {
        //Given
        //When
        BigDecimal result = calculator.factorial(new BigDecimal("1000"));

        //BigDecimal result = calculator.factorial(new BigDecimal(4));

        //Then
        LOGGER.info("Testing factorial method");
        assertTrue(BigDecimal.ONE.compareTo(result) <0);
        //assertEquals(new BigDecimal(24.0).setScale(2), result.setScale(2));
    }
}
