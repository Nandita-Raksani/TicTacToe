package com.kata.practise;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TicTacToeTest {
    @Test
    public void newGameInstanceShouldNotBeNull() {
        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe);
    }

    @Test
    public void shouldStartGameWithAnEmptyBoard(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.startGame();
        GameBoard gameBoard = new GameBoard();
        assertTrue(gameBoard.isVacant());
    }
}
