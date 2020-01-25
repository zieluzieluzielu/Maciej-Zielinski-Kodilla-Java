package com.kodilla.patterns.builder.checkers;

import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {

    @Test
    public void testCheckersBuilder(){
        //given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(Factory.PAWN, Figure.WHITE, 0, 3)
                .Figure(Factory.PAWN, Figure.BLACK, 9, 7)
                .Figure(Factory.QUEEN, Figure.WHITE, 0, 2)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure figureOne = checkers.getBoard().getFigure(0, 3);
        Figure figureTwo = checkers.getBoard().getFigure(9, 7);
        Figure figureThree = checkers.getBoard().getFigure(0, 2);
        Figure figureFour = checkers.getBoard().getFigure(1, 1);

        //Then
        Assert.assertEquals(Figure.WHITE, figureOne.getColor());
        Assert.assertEquals(Pawn.class, figureTwo.getClass());
        Assert.assertEquals(Queen.class, figureThree.getClass());
        Assert.assertNull(figureFour);
    }
}
