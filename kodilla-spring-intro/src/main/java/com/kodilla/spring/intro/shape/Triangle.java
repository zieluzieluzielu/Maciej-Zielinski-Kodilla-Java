package com.kodilla.spring.intro.shape;

public class Triangle implements Shape {
    @Override
    public String draw(){
        System.out.println("This is triangle");
        return "Triangle";
    }
}
