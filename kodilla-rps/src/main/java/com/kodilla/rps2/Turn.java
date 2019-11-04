package com.kodilla.rps2;

import java.util.Random;
import java.util.Scanner;

public class Turn extends RpsRunner{

    private Random computersChoice = new Random();
    Scanner scan = new Scanner(System.in);

    String choice(){
        return String.valueOf(computersChoice.nextInt(3) + 1);
    }

    String usersChoice(){
       return scan.nextLine();
    }

    Integer roundsChoice() {
        return scan.nextInt();
    }

}
