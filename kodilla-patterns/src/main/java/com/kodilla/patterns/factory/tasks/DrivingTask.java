package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean executedTask;

    DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (where.contains("Barcelona") && (using.equals("Car"))){
            executedTask = true;
            System.out.println("Driving task was successfully executed [ "+toString()+" ]");
        }
        else {
            executedTask = false;
            System.out.println("Driving task was not executed");
            }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return executedTask;
    }

    @Override
    public String toString() {
        return "Task: "+taskName + ", Where?: " + where +
                ", Using: " + using;
    }
}
