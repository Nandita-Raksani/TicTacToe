package com.kata.practise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    public static final char SYMBOL_X = 'X';
    public static final char SYMBOL_O = 'O';
    public static final String IS_THE_WINNER = " is the winner!";
    TicTacToe ticTacToe;

    @Before
    public void shouldInitializeTicTacToe(){
        ticTacToe = new TicTacToe();
    }

    @Test
    public void newGameInstanceShouldNotBeNull() {
        assertNotNull(ticTacToe);
    }

    @Test
    public void shouldStartGameWithAnEmptyBoard(){
        assertTrue(ticTacToe.isVacant());
    }

    @Test
    public void shouldAssignFirstTurnAsX(){
        ticTacToe.play(0,0);
        assertEquals(SYMBOL_X, ticTacToe.getSymbolAt(0,0));
    }

    @Test
    public void shouldAssignSecondTurnAsO(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        assertEquals(SYMBOL_O, ticTacToe.getSymbolAt(0,1));
    }

    @Test
    public void shouldAssignThirdTurnAsX(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        ticTacToe.play(0,2);
        assertEquals(SYMBOL_X, ticTacToe.getSymbolAt(0,2));
    }

    @Test
    public void shouldDeclareXAsWinnerIfFirstHorizontalRowIsFilledByX(){
        ticTacToe.play(0,0);
        ticTacToe.play(1,1);
        ticTacToe.play(0,1);
        ticTacToe.play(1,2);
        assertEquals(SYMBOL_X + IS_THE_WINNER, ticTacToe.play(0,2));
    }

    @Test
    public void shouldDeclareOAsWinnerIfSecondHorizontalRowIsFilledByO(){
        ticTacToe.play(0,0);
        ticTacToe.play(1,0);
        ticTacToe.play(0,1);
        ticTacToe.play(1,1);
        ticTacToe.play(2,2);
        assertEquals(SYMBOL_O + IS_THE_WINNER, ticTacToe.play(1,2));
    }

}
