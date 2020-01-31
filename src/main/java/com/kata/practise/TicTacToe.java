package com.kata.practise;

public class TicTacToe {
    GameBoard gameBoard;

    public TicTacToe() {
        gameBoard = new GameBoard();
    }

    public boolean isVacant() {
        return gameBoard.isVacant();
    }

    public void play(int row, int column) {
        gameBoard.markSymbols(row, column);
    }

    public char getSymbolAt(int row, int column) {
        return gameBoard.getSymbolAt(row, column);
    }
}
