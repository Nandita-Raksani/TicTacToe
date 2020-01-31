package com.kata.practise;

public class TicTacToe {
    GameBoard gameBoard;

    public TicTacToe() {
        gameBoard = new GameBoard();
    }

    public boolean isVacant() {
        return gameBoard.isVacant();
    }

    public void play(int row, int column, char symbol) {
        gameBoard.markSymbols(row, column, symbol);
    }

    public char getSymbolAt(int row, int column) {
        return gameBoard.getSymbolAt(row, column);
    }
}
