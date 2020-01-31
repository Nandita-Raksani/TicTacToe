package com.kata.practise;

public class TicTacToe {
    GameBoard gameBoard;

    public TicTacToe() {
        gameBoard = new GameBoard();
    }

    public boolean isVacant() {
        return gameBoard.isVacant();
    }
}
