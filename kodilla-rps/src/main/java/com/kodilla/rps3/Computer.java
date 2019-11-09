package com.kodilla.rps3;

import java.util.Random;

class Computer {

    String generateComputerChoice(User user) {
        //Random random = new Random();
        //String.valueOf(random.nextInt(3) + 1);

        switch (user.getUserTurn()) {
            case "1":
                return "1";
            case "2":
                return "1";
            case "3":
                return "1";
            default:
                return "";
        }
    }
}
