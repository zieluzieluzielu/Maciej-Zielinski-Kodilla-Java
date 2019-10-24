package com.kodilla.stream.lambda;

public class ExecuteSaySomething2 implements Executor {
    @Override
    public void process(){
        System.out.println("This is an additional text.");
    }
}
