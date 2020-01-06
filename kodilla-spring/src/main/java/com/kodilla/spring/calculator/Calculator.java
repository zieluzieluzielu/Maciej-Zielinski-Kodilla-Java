package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    double sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;
    }


    double mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }

    double div(double a, double b) {
        double result = a / b;
        display.displayValue(result);
        return result;
    }
}
