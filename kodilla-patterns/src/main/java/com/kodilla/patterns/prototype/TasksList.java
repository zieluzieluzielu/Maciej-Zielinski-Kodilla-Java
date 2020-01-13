package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class TasksList {

    final private String name;
    final private List<Task> tasks = new ArrayList<>();

    public TasksList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for(Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}
