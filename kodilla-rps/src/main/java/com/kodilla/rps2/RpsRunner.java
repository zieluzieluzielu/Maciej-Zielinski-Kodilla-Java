package com.kodilla.rps2;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;
        Points points = new Points(0,0,1);
        int computerPoints = points.getComputerPoints();
        int userPoints = points.getUserPoints();
        int roundNr = points.getRoundNr();

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = scan.nextLine();

        System.out.print("Welcome " + firstName + ". Let's start a Rock–paper–scissors game!\n");

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
           // Turn computerTurn = new Turn();
            Game game = new Game();
            //game.computerChoice;
           // String computerChoice = computerTurn.choice();

            if (roundNr <= rounds) {
                game.game();

            } else
             {
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

