package com.kodilla.patterns2.observer.homework;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task implements Observable {

    @Autowired
    public Student student;

    private final List<Observer> observers;
    private final Map<String, Student> tasks;
    private final String name;

    public Task(String name) {
        observers = new ArrayList<>();
        tasks = new HashMap<>();
        this.name = name;
    }

    public void addTask(String task, Student student) {
        tasks.put(task,student);
        notifyObservers(student);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);


    }

    @Override
    public void notifyObservers(Student student) {
        for (Observer observer : observers) {
            observer.update(this,student);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    public Map<String, Student> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
