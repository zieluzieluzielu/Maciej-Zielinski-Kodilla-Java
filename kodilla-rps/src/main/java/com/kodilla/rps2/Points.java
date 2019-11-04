package com.kodilla.rps2;

public class Points {

    int computerPoints;
    int userPoints;
    int roundNr;

    public Points(int computerPoints, int userPoints, int roundNr) {
        this.computerPoints = computerPoints;
        this.userPoints = userPoints;
        this.roundNr = roundNr;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public int getRoundNr() {
        return roundNr;
    }


}
