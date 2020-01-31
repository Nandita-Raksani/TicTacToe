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
        return isWinIfHorizontalRowOccupiedWithSameSymbol() || isWinIfVerticalColumnOccupiedWithSameSymbol() || isWinIfUpperLeftToLowerRightDiagonalOccupiedWithSameSymbol() || isWinIfUpperRightToLowerLeftDiagonalOccupiedWithSameSymbol();
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

    private boolean isWinIfVerticalColumnOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int column = 0; column < gridlayout[0].length; column++) {
            if (gridlayout[0][column] != '\0' && gridlayout[0][column] == gridlayout[1][column] && gridlayout[1][column] == gridlayout[2][column]) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinIfUpperLeftToLowerRightDiagonalOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][0] != '\0' && gridlayout[0][0] == gridlayout[1][1] && gridlayout[1][1] == gridlayout[2][2]) {
            return true;
        }
        return false;
    }
    private boolean isWinIfUpperRightToLowerLeftDiagonalOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][2] != '\0' && gridlayout[0][2] == SYMBOL_X && gridlayout[1][1] == SYMBOL_X && gridlayout[2][0] == SYMBOL_X) {
            return true;
        } else if (gridlayout[0][2] != '\0' && gridlayout[0][2] == SYMBOL_O && gridlayout[1][1] == SYMBOL_O && gridlayout[2][0] == SYMBOL_O) {
            return true;
        }
        return false;
    }

}
