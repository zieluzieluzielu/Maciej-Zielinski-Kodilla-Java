package com.kodilla.rps3;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Game game = new Game();
        game.welcomeScreen();
        game.theGame();
        game.endGame();

    }

}

