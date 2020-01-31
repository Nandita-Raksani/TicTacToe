package com.kata.practise;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void newGameInstanceShouldNotBeNull() {
        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe);
    }

    @Test
    public void shouldStartGameWithAnEmptyBoard(){
        TicTacToe ticTacToe = new TicTacToe();
        assertTrue(ticTacToe.isVacant());
    }

    @Test
    public void shouldAssignFirstTurnAsX(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play(0,0);
        assertEquals('X', ticTacToe.getSymbolAt(0,0));
    }
}
