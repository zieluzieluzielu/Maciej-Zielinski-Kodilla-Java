package com.kodilla.rps3;

import java.util.Random;

class Computer {

    String generateComputerChoice(String choice) {
        Random random = new Random();
        double randomChoose = random.nextDouble(); //random value in range 0.0-1.0

        switch (choice) {
            case "1":
                if (randomChoose <=0.25) {
                    return "1";
                }
                if (randomChoose > 0.25 && randomChoose <= 0.5) {
                    return "3";
                }
                else {
                    return "2";
                }
            case "2":
                if (randomChoose <=0.25) {
                    return "2";
                }
                if (randomChoose > 0.25 && randomChoose <= 0.5) {
                    return "1";
                }
                else {
                    return "3";
                }
            case "3":
                if (randomChoose <=0.25) {
                    return "3";
                }
                if (randomChoose > 0.25 && randomChoose <= 0.5) {
                    return "2";
                }
                else {
                    return "1";
                }
            default:
                return "1";
        }
    }
}
