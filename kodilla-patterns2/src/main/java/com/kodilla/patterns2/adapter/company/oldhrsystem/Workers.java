package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"5436456564", "John", "Smith"},
            {"5436456567", "Anne", "Smith"},
            {"7436456567", "Bill", "Smith"},
            {"8436456568", "Mark", "Smith"},
            {"5436456568", "Tom", "Smith"}};


    private double[] salaries = {
            6000.00,
            7000.00,
            4000.00,
            5500.00,
            6900.00,
    };

    public String getWorker(int n) {
        if (n >salaries.length) {
            return "";
        }
        return workers[n][0] + ", "+ workers[n][1]+", "+workers[n][2]+", "+salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
