package com.kodilla.patterns2.aop.calculator;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@EnableAspectJAutoProxy
public class Calculator {
    public double add(double x, double y) {
        return x+y;
    }

    public double substract(double x, double y) {
        return x-y;
    }

    public double multiply(double x, double y) {
        return x*y;
    }


    public double divide(double x, double y) {
        if ( y == 0) {
            throw new ArithmeticException("Divide by zero!");
        } else {
            return x/y;
        }
    }

    public BigDecimal factorial (BigDecimal n) {
        if (n.compareTo(BigDecimal.ONE) > 0) {
            return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
        } else if (n.equals(BigDecimal.ONE) || n.equals(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        } else {
            throw new ArithmeticException("Factorial argument is negative!");
        }
    }




}
