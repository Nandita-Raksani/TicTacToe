package com.kata.practise;

public class TicTacToe {
    public static final char SYMBOL_O = 'O';
    public static final char SYMBOL_X = 'X';
    public static final String IS_THE_WINNER = " is the winner!";

    GameBoard gameBoard;
    char pastSymbol;

    public TicTacToe() {
        gameBoard = new GameBoard();
    }

    public boolean isVacant() {
        return gameBoard.isVacant();
    }

    public String play(int row, int column) {
        gameBoard.markSymbols(row, column, currentSymbol());
        if(isWinner()) {
            return pastSymbol + IS_THE_WINNER;
        }
        return null;
    }

    public char getSymbolAt(int row, int column) {
        return gameBoard.getSymbolAt(row, column);
    }

    public char currentSymbol(){
        if(pastSymbol != '\0' && pastSymbol == SYMBOL_X)
            return pastSymbol = SYMBOL_O;
        else
            return pastSymbol = SYMBOL_X;
    }

    private boolean isWinner() {
        return isWinIfHorizontalRowOccupiedWithSameSymbol();
    }

    private boolean isWinIfHorizontalRowOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int row = 0; row < gridlayout[0].length; row++) {
            if (gridlayout[row][0] == gridlayout[row][1] && gridlayout[row][1] == gridlayout[row][2]
                    && gridlayout[row][0] != '\0') {
                return true;
            }
        }
        return false;
    }

}
