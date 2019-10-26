package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){

        Forum forum = new Forum();
        Map<Integer,ForumUser> theResultForumUsers = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> (Period.between(user.getBirthDate(),LocalDate.now()).getYears()) > 20)
                .filter(user -> user.getPostsCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));
        System.out.println("# elements: "+ theResultForumUsers.size());

        theResultForumUsers.entrySet().stream()
                .map(entry -> "Id #"+ entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);

/*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringOfBooks);*/
        /*

        BookDirectory thebookDirectory = new BookDirectory();
        Map<String,Book> theResultMapOfBooks = thebookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: "+ theResultMapOfBooks.size());

        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);*/
                 //.forEach(System.out::println);

/*            People.getList().stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.length() >11)
                    .map(s -> s.substring(0, s.indexOf(" ") + 2) + ".")
                    .filter(s -> s.substring(0,1).equals("M"))
                    .forEach(System.out::println);*/


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
     /*   ExpressionExecutor expressionExecutor = new ExpressionExecutor();
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
        NumbersGenerator.generateEven(20);*/

    }
}
