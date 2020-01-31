package com.kata.practise;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TicTacToeTest {
    @Test
    public void newGameInstanceShouldNotBeNull() {
        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe);
    }
}
