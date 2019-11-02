package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;
        Random computersChoice = new Random();

        int computerPoints = 0;
        int userPoints = 0;
        int roundNr = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = scan.nextLine();

        System.out.print("Welcome " + firstName + ". Let's start a game.\n");

        System.out.println("How many rounds do you want to play? (minimum: 1 , maximum: 3)");
        int rounds = scan.nextInt();

        while (rounds > 3 || rounds < 1) {
            System.out.print("Please select the correct number of rounds (minimum: 1 , maximum: 3). You've selected " + rounds + " rounds.\n");
            System.out.println("How many rounds do you want to play? (minimum: 1 , maximum: 3)\n");
            rounds = scan.nextInt();
        }

        System.out.print("You've chosen " + rounds + " rounds.\n");
        scan.nextLine();


        while (!end) {

            if (roundNr <= rounds) {

                System.out.println("Round " + roundNr + "/" + rounds + "\nPlease select your move(1=rock, 2=paper, 3=scissors)");
                String userTurn = scan.nextLine();
                if (userTurn.equals("1")) {
                    System.out.println(firstName + "'s choice: Rock");

                    String computerTurn = String.valueOf(computersChoice.nextInt(3) + 1);
                    switch (computerTurn) {
                        case "3":
                            System.out.println("Computers choice: Scissors");
                            userPoints++;
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                        case "2":
                            System.out.println("Computers choice: Paper");
                            computerPoints++;
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                        case "1":
                            System.out.println("Computers choice: Rock");
                            System.out.println(firstName + " vs  Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                    }
                }
                if (userTurn.equals("2")) {
                    System.out.println(firstName + "'s choice: Paper");

                    String computerTurn = String.valueOf(computersChoice.nextInt(3) + 1);

                    switch (computerTurn) {
                        case "3":
                            System.out.println("Computers choice: Scissors");
                            computerPoints++;
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                        case "2":
                            System.out.println("Computers choice: Paper");
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                        case "1":
                            System.out.println("Computers choice: Rock");
                            userPoints++;
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                    }
                }

                if (userTurn.equals("3")) {
                    System.out.println(firstName + "'s choice: Scissors");

                    String computerTurn = String.valueOf(computersChoice.nextInt(3) + 1);
                    switch (computerTurn) {
                        case "3":
                            System.out.println("Computers choice: Scissors");
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                        case "2":
                            System.out.println("Computers choice: Paper");
                            userPoints++;
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                        case "1":
                            System.out.println("Computers choice: Rock");
                            computerPoints++;
                            System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
                            roundNr++;
                            break;
                    }
                }

                if (userTurn.toLowerCase().equals("n")) {
                    System.out.println("Are you sure what to start the new game (all current data will be lost)?");
                    String confirmation = scan.nextLine();
                    if (confirmation.toLowerCase().equals("yes") || (confirmation.toLowerCase().equals("y"))) {
                        computerPoints = 0;
                        userPoints = 0;
                        roundNr = 1;
                    } else {
                        System.out.println("Coming back to the game..");
                    }
                }

                if (userTurn.toLowerCase().equals("x")) {
                    System.out.println("Are you sure what to end the game?");
                    String confirmation = scan.nextLine();
                    if (confirmation.toLowerCase().equals("yes") || (confirmation.toLowerCase().equals("y"))) {
                        end = true;
                    } else {
                        System.out.println("Coming back to the game..");
                    }

                }

            } else {
                end = true;

                if (userPoints > computerPoints) {
                    System.out.println("Congratulations " + firstName + ". You are the winner!");
                } else if (userPoints < computerPoints) {
                    System.out.println("You lost!");
                } else {
                    System.out.println("Draw.");
                }

            }
        }
        System.out.println("GAME OVER");


    }

}

