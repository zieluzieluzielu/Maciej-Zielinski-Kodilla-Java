package com.kodilla.sudoku;

public class SudokuGame {
    boolean resolveSudoku() {
        return true;
    }

    public static void main(String[] args) {
        boolean gameFinished = false;

        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

        }

//        Odczytywanie danych pobieranych od użytkownika zrealizuj przy pomocy klasy  bibliotecznej Scanner.
//        Wyświetlanie planszy zrealizuj przy pomocy znaków | (pipe) oraz - (myślnik) dla ramek (jako metodę toString() klasy SudokuBoard).
    }
}
