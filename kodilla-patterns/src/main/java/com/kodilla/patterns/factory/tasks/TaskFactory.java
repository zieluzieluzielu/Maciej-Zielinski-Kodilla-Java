package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive Abroad","Berlin, Paris, Barcelona, London","Car");
            case PAINTINGTASK:
                return new PaintingTask("Picasso Style Painting","Red","Autoportrait");
            case SHOPPINGTASK:
                return new ShoppingTask("Preparing Italian Food","Pasta",500);
            default:
                return null;
        }
    }
}
