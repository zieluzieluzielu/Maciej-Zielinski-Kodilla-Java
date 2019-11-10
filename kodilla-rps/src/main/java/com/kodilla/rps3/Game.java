package com.kodilla.rps3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Game {

    private boolean end = false;
    private Scanner scan = new Scanner(System.in);
    private Computer computerTurn = new Computer();
    private String firstName = new User().getUserName();
    private User user = new User();

    private int computerPoints;
    private int userPoints;
    private int roundNr;
    private int rounds;

    private void welcomeScreen() {
        System.out.print("Welcome " + firstName + ". Let's start a Rock–paper–scissors game!\n");
        System.out.println("[ CONTROLS ]\n" +
                "1 - Rock\n" +
                "2 - Paper\n" +
                "3 - Scissors\n" +
                "n - new game\n" +
                "x - end game\n" +
                "c - controls");
    }

    private void roundSelector() {
        System.out.println("[ SELECT ROUNDS ]\n"
                + "How many rounds do you want to play? (minimum: 1 , maximum: 3)");

        try {
            rounds = scan.nextInt();
            while (!(rounds <= 3 && rounds >= 1)) {
                System.out.print("Please select the correct number of rounds (minimum: 1 , maximum: 3). You've selected " + rounds + " rounds.\n");
                System.out.println("How many rounds do you want to play? (minimum: 1 , maximum: 3)");
                rounds = scan.nextInt();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Integers only, please.");
            System.out.println("How many rounds do you want to play? (minimum: 1 , maximum: 3)");
            Scanner scan = new Scanner(System.in);
            rounds = scan.nextInt();
        }

        System.out.print("You've chosen " + rounds + " rounds.\n");
        scan.nextLine();

    }

    private void currentScore(){
        System.out.println(firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
    }

    void theGame() {
        computerPoints = 0;
        userPoints = 0;
        roundNr = 1;

        welcomeScreen();
        roundSelector();

        while (!end) {

            if (roundNr <= rounds) {

                System.out.println("[ ROUND " + roundNr + "/" + rounds + " ]");
                String userTurn = user.getUserTurn();

                if (userTurn.equals("1")) {
                    System.out.println(firstName + "'s choice: Rock");
                    computerMoveUserRock(userTurn);
                }

                if (userTurn.equals("2")) {
                    System.out.println(firstName + "'s choice: Paper");
                    computerMoveUserPaper(userTurn);
                }

                if (userTurn.equals("3")) {
                    System.out.println(firstName + "'s choice: Scissors");
                    computerMoveUserScissors(userTurn);
                }

                if (userTurn.toLowerCase().equals("n")) {
                    System.out.println("Are you sure what to start the new game (all current data will be lost)?");
                    String confirmation = scan.nextLine();
                    if (confirmation.toLowerCase().equals("yes") || (confirmation.toLowerCase().equals("y"))) {
                        theGame();
                    } else {
                        System.out.println("Coming back to the game..");
                    }
                }

                if (userTurn.toLowerCase().equals("x")) {
                    System.out.println("Are you sure what to end the game?");
                    String confirmation = scan.nextLine();
                    if (confirmation.toLowerCase().equals("yes") || (confirmation.toLowerCase().equals("y"))) {
                        end = true;
                        endGame();
                    } else {
                        System.out.println("Coming back to the game..");
                    }

                }

                if (userTurn.toLowerCase().equals("c")) {
                    System.out.println("[ CONTROLS ]\n" +
                            "1 - Rock\n" +
                            "2 - Paper\n" +
                            "3 - Scissors\n" +
                            "n - new game\n" +
                            "x - end game\n" +
                            "c - controls");
                }

            } else {
                end = true;
                endGame();
            }
        }
    }

    private void computerMoveUserScissors(String userTurn) {
        String computer = computerTurn.generateComputerChoice(userTurn);

        switch (computer) {
            case "3":
                System.out.println("Computers choice: Scissors");
                currentScore();
                roundNr++;
                break;
            case "2":
                System.out.println("Computers choice: Paper");
                userPoints++;
                currentScore();
                roundNr++;
                break;
            case "1":
                System.out.println("Computers choice: Rock");
                computerPoints++;
                currentScore();
                roundNr++;
                break;
            case "4":
                System.out.println("Computer choose 4");
                roundNr++;
                break;
        }
    }

    private void computerMoveUserPaper(String userTurn) {
        String computer = computerTurn.generateComputerChoice(userTurn);

        switch (computer) {
            case "3":
                System.out.println("Computers choice: Scissors");
                computerPoints++;
                currentScore();
                roundNr++;
                break;
            case "2":
                System.out.println("Computers choice: Paper");
                currentScore();
                roundNr++;
                break;
            case "1":
                System.out.println("Computers choice: Rock");
                userPoints++;
                currentScore();
                roundNr++;
                break;
            case "4":
                System.out.println("Computer choose 4");
                roundNr++;
                break;
        }
    }


    private void computerMoveUserRock(String userTurn) {
        String computer = computerTurn.generateComputerChoice(userTurn);

        switch (computer) {
            case "3":
                System.out.println("Computers choice: Scissors");
                userPoints++;
                currentScore();
                roundNr++;
                break;
            case "2":
                System.out.println("Computers choice: Paper");
                computerPoints++;
                currentScore();
                roundNr++;
                break;
            case "1":
                System.out.println("Computers choice: Rock");
                currentScore();
                roundNr++;
                break;
            case "4":
                System.out.println("Computer choose 4");
                roundNr++;
                break;
        }
    }

    private void endGame() {
        System.out.println("[ THE END ]");

        if (userPoints > computerPoints) {
            System.out.println("Congratulations " + firstName + ". You are the winner!\n" +
                    "Final result: " + firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
        } else if (userPoints < computerPoints) {
            System.out.println("You lost!\n" +
                    "Final result: " + firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
        } else if (userPoints == computerPoints && roundNr == 1) {
            System.out.println("The game wasn't played.");
        } else {
            System.out.println("Draw.\n" +
                    "Final result: " + firstName + " vs Computer : [" + userPoints + ":" + computerPoints + "]");
        }

    }

}
