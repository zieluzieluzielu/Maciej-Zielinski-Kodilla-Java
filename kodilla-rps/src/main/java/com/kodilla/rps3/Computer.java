package com.kodilla.rps3;

import java.util.Random;

class Computer {

    String generateComputerChoice() {
        Random random = new Random();
        return String.valueOf(random.nextInt(3) + 1);
    }
}
