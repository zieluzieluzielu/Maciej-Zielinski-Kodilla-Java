package com.kodilla.rps3;

import java.util.Scanner;

public class User {

    String getUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("[ RPS GAME ]\n" +
                "What is your name?");
        return scan.nextLine();
    }

    String getUserTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select your move (1=rock, 2=paper, 3=scissors)");
        return scan.nextLine();
    }
}
