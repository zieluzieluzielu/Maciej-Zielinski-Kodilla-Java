package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TasksTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Task designPattern = new DesignPatternsTask();
        Task exceptionHandling = new ExceptionHandlingTask();
        Task springWeb = new SpringWebTask();
        Mentor megRyan = new Mentor("Meg Ryan");
        Mentor alBundy = new Mentor("Al Bundy");

        Student zbigniew = new Student("Zbigniew");
        Student ala = new Student("Ala");

        designPattern.registerObserver(megRyan);
        exceptionHandling.registerObserver(megRyan);
        springWeb.registerObserver(megRyan);
        designPattern.registerObserver(alBundy);

        //When
        designPattern.addTask("Task 1",ala);
        exceptionHandling.addTask("Task 2",zbigniew);
        springWeb.addTask("Task 3",ala);
        designPattern.addTask("Task 4",zbigniew);
        springWeb.addTask("Task 5",zbigniew);
        springWeb.addTask("Task 6",zbigniew);

        //Then
        assertEquals(6, megRyan.getUpdateCount());
        assertEquals(2, alBundy.getUpdateCount());
    }
}
