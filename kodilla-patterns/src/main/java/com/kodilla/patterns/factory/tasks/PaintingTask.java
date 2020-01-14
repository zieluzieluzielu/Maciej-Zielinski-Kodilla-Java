package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean executedTask;

    PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (color.equals("Red") && (whatToPaint.equals("Autoportrait"))){
            executedTask = true;
            System.out.println("Painting task was successfully executed [ "+toString()+" ]");
        }
        else {
            executedTask = false;
            System.out.println("Painting task was not executed");
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
        return "Task: "+taskName + ", Color: " + color +
                ", What: " + whatToPaint;
    }
}
