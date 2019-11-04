package com.kodilla.rps2;

import java.util.Scanner;

public class User {
    Scanner scan = new Scanner(System.in);

    public String getFirstName() {
        return scan.nextLine();
    }
}
