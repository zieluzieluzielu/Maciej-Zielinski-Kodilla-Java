package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        //Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //ExecuteSaySomething2 executeSaySomething2 = new ExecuteSaySomething2();
        //processor.execute(executeSaySomething);
        //processor.execute(executeSaySomething2);
        //Executor codeToExecute = () -> System.out.print("This is an example lambda text");
        //processor.execute(codeToExecute);
        //processor.execute(() -> System.out.print("This is an example lambda text"));
        //codeToExecute;
        //System.out.println("Welcome to module 7 - Stream");
        //SaySomething saySomething = new SaySomething();
        //saySomething.say();
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas:");
        expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a / b);

        System.out.println("Calculating expressions with method references:");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Beautifing texts:");
        poemBeautifier.beutify("TEXT to be LOWERCASED",(a) -> a.toLowerCase());
        poemBeautifier.beutify("First part of the text",(a) -> a+" - and the other part of the text");
        poemBeautifier.beutify("Cutting the sentence to a part",(a) -> (a.substring(8,20).toUpperCase()));
        poemBeautifier.beutify("Some text",(a) -> a.replace("Some","Replaced"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
