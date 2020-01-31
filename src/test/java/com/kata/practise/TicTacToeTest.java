package com.kata.practise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    public static final char SYMBOL_X = 'X';
    public static final char SYMBOL_O = 'O';
    public static final String IS_THE_WINNER = " is the winner!";
    public static final String GAME_IS_DRAW = "Game is Draw";
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

    @Test
    public void shouldDeclareXAsWinnerIfThirdHorizontalRowIsFilledByX(){
        ticTacToe.play(2,0);
        ticTacToe.play(1,0);
        ticTacToe.play(2,1);
        ticTacToe.play(1,1);
        assertEquals(SYMBOL_X + IS_THE_WINNER, ticTacToe.play(2,2));
    }

    @Test
    public void shouldDeclareXAsWinnerIfFirstVerticalColumnIsFilledByX(){
        ticTacToe.play(0,0);
        ticTacToe.play(1,1);
        ticTacToe.play(1,0);
        ticTacToe.play(1,2);
        assertEquals(SYMBOL_X + IS_THE_WINNER, ticTacToe.play(2,0));
    }

    @Test
    public void shouldDeclareOAsWinnerIfSecondVerticalColumnIsFilledByO(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        ticTacToe.play(2,2);
        ticTacToe.play(1,1);
        ticTacToe.play(1,2);
        assertEquals(SYMBOL_O + IS_THE_WINNER, ticTacToe.play(2,1));
    }

    @Test
    public void shouldDeclareXAsWinnerIfThirdVerticalColumnIsFilledByX(){
        ticTacToe.play(0,2);
        ticTacToe.play(0,1);
        ticTacToe.play(1,2);
        ticTacToe.play(1,1);
        assertEquals(SYMBOL_X + IS_THE_WINNER, ticTacToe.play(2,2));
    }

    @Test
    public void shouldDeclareXAsWinnerIfUpperLeftToLowerRightDiagonallyIsFilledByX(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        ticTacToe.play(1,1);
        ticTacToe.play(1,0);
        assertEquals(SYMBOL_X + IS_THE_WINNER, ticTacToe.play(2,2));
    }

    @Test
    public void shouldDeclareOAsWinnerIfUpperLeftToLowerRightDiagonallyIsFilledByO(){
        ticTacToe.play(0,1);
        ticTacToe.play(0,0);
        ticTacToe.play(1,0);
        ticTacToe.play(1,1);
        ticTacToe.play(0,2);
        assertEquals(SYMBOL_O + IS_THE_WINNER, ticTacToe.play(2,2));
    }

    @Test
    public void shouldDeclareXAsWinnerIfUpperRightToLowerLeftDiagonallyIsFilledByX(){
        ticTacToe.play(0,2);
        ticTacToe.play(0,1);
        ticTacToe.play(1,1);
        ticTacToe.play(1,0);
        assertEquals(SYMBOL_X + IS_THE_WINNER, ticTacToe.play(2,0));
    }

    @Test
    public void shouldDeclareOAsWinnerIfUpperRightToLowerLeftDiagonallyIsFilledByO(){
        ticTacToe.play(0,1);
        ticTacToe.play(0,2);
        ticTacToe.play(1,0);
        ticTacToe.play(1,1);
        ticTacToe.play(2,1);
        assertEquals(SYMBOL_O + IS_THE_WINNER, ticTacToe.play(2,0));
    }

    @Test
    public void shouldDeclareDrawIfAllRowsAndColumnAreFilled(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        ticTacToe.play(0,2);
        ticTacToe.play(1,2);
        ticTacToe.play(1,1);
        ticTacToe.play(2,2);
        ticTacToe.play(1,0);
        ticTacToe.play(2,0);
        assertEquals(GAME_IS_DRAW, ticTacToe.play(2,1));
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowToSelectAnOccupiedPosition() {
        ticTacToe.play(0, 0);
        ticTacToe.play(0, 1);
        ticTacToe.play(0,0);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowToSelectARangeOutsideOfBoardSize() {
        ticTacToe.play(0, 0);
        ticTacToe.play(0, 1);
        ticTacToe.play(0,3);
    }

}