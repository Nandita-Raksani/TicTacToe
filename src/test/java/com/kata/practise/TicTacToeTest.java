package com.kata.practise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
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
        assertEquals('X', ticTacToe.getSymbolAt(0,0));
    }

    @Test
    public void shouldAssignSecondTurnAsO(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        assertEquals('O', ticTacToe.getSymbolAt(0,1));
    }

    @Test
    public void shouldAssignThirdTurnAsX(){
        ticTacToe.play(0,0);
        ticTacToe.play(0,1);
        ticTacToe.play(0,2);
        assertEquals('X', ticTacToe.getSymbolAt(0,2));
    }
}
