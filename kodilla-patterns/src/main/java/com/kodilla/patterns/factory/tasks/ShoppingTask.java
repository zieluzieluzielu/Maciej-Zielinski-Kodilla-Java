package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean executedTask;

    ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (whatToBuy.contains("Pasta") && (quantity < 1000.00)){
            executedTask = true;
            System.out.println("Shopping task was successfully executed [ "+toString()+" ]");
        }
        else {
            executedTask = false;
            System.out.println("Shopping task was not executed");
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
        return "Task: "+taskName + ", What to buy: " + whatToBuy +
                ", Quantity: " + quantity+"g";
    }
}
