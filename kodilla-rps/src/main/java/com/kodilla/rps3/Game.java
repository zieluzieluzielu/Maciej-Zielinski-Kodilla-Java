package com.kodilla.rps3;

import java.util.Scanner;

class Game {

    private boolean end = false;

    private Scanner scan = new Scanner(System.in);
    private Computer computerTurn = new Computer();
    private String firstName =  new User().getUserName();
    private User user = new User();

    private int computerPoints = 0;
    private int userPoints = 0;
    private int roundNr = 1;

    void welcomeScreen() {

        System.out.print("Welcome " + firstName + ". Let's start a Rock–paper–scissors game!\n");
        System.out.println("[ CONTROLS ]\n" +
                "1 - Rock\n" +
                "2 - Paper\n" +
                "3 - Scissors\n" +
                "n - new game\n"+
                "x - end game\n"+
                "c - controls");
    }


    void theGame() {

        System.out.println("[ SELECT ROUNDS ]\n"
                +"How many rounds do you want to play? (minimum: 1 , maximum: 3)");
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

                System.out.println("[ ROUND " + roundNr + "/" + rounds + " ]");
                String userTurn = user.getUserTurn();

                if (userTurn.equals("1")) {
                    System.out.println(firstName + "'s choice: Rock");
                    String computer = computerTurn.generateComputerChoice();

                    switch (computer) {
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

                    String computer = computerTurn.generateComputerChoice();

                    switch (computer) {
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

                    String computer = computerTurn.generateComputerChoice();
                    switch (computer) {
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


                if (userTurn.toLowerCase().equals("c")) {
                    System.out.println("[ CONTROLS ]\n" +
                            "1 - Rock\n" +
                            "2 - Paper\n" +
                            "3 - Scissors\n" +
                            "n - new game\n"+
                            "x - end game\n"+
                            "c - controls");
                }


            } else {
                end = true;

            }
        }


    }

    void endGame() {
        System.out.println("[ END GAME ]");

        if (userPoints > computerPoints) {
            System.out.println("Congratulations " + firstName + ". You are the winner!\n"+
                    "Final result: "+firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
        } else if (userPoints < computerPoints) {
            System.out.println("You lost!\n"+
                    "Final result: "+firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
        } else {
            System.out.println("Draw.\n"+
                    "Final result: "+firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
        }

    }


}
