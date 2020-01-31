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

    public String play(int row, int column) {
        gameBoard.markSymbols(row, column, currentSymbol());
        if(isWinner()) {
            return pastSymbol + " is the winner!";
        }
        return null;
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
