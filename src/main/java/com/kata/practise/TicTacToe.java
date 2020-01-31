package com.kata.practise;

public class TicTacToe {
    GameBoard gameBoard;
    char pastSymbol;

    public TicTacToe() {
        gameBoard = new GameBoard();
    }

    public boolean isVacant() {
        return gameBoard.isVacant();
    }

    public void play(int row, int column) {
        gameBoard.markSymbols(row, column, currentSymbol());
    }

    public char getSymbolAt(int row, int column) {
        return gameBoard.getSymbolAt(row, column);
    }

    public char currentSymbol(){
        if(pastSymbol != '\0' && pastSymbol == 'X')
            return pastSymbol = 'O';
        else
            return pastSymbol = 'X';
    }

}
