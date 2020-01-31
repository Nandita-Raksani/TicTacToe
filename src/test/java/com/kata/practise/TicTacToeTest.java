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
        ticTacToe.play(0,0, 'X');
        assertEquals('X', ticTacToe.getSymbolAt(0,0));
    }

    @Test
    public void shouldAssignSecondTurnAsO(){
        ticTacToe.play(0,1, 'O');
        assertEquals('O', ticTacToe.getSymbolAt(0,1));
    }
}
