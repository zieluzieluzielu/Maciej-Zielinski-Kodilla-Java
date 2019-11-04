package com.kodilla.rps2;

import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);

    Turn turn = new Turn();
    User user = new User();

    Points points = new Points(0,0,1);
    int computerPoints = points.getComputerPoints();
    int userPoints = points.getUserPoints();
    int roundNr = points.getRoundNr();
    String computerChoice = turn.choice();
    String userChoice = turn.usersChoice();
    int rounds = turn.roundsChoice();
    String firstName = user.getFirstName();
    boolean end = false;


    public void game (){

        System.out.println("Round " + roundNr + "/" + rounds + "\nPlease select your move(1=rock, 2=paper, 3=scissors)");
        String userTurn = turn.usersChoice();


        if (userTurn.equals("1")) {
            System.out.println(firstName + "'s choice: Rock");

            switch (computerChoice) {
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

            switch (computerChoice) {
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

            switch (computerChoice) {
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

    }



}
