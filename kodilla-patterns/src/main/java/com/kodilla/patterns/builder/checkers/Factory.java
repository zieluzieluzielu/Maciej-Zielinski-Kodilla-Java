package com.kodilla.patterns.builder.checkers;

public final class Factory {
    public static final String PAWN="PAWN";
    public static final String QUEEN="QUEEN";

    public static Figure makeFigure(final String figureType, String color) {
      if (figureType.equals(PAWN)) {
          return new Pawn(color);
      } else if (figureType.equals(QUEEN)) {
          return new Queen(color);
      } else {
          throw new IllegalStateException("Type of figure should be Pawn or Queen!");
      }
    }
}
