package com.kata.practise;

public class TicTacToe {
    public static final char SYMBOL_O = 'O';
    public static final char SYMBOL_X = 'X';
    public static final String IS_THE_WINNER = " is the winner!";
    public static final char EMPTY_SPACE = '\0';
    public static final String GAME_IS_DRAW = "Game is Draw";

    GameBoard gameBoard;
    char pastSymbol;

    public TicTacToe() {
        gameBoard = new GameBoard();
    }

    public boolean isVacant() {
        return gameBoard.isVacant();
    }

    public String play(int row, int column) {
        if(isInValidPosition(row, column)){
            throw new RuntimeException("Position already occupied, please select another position");
        }
        gameBoard.markSymbols(row, column, currentSymbol());
        if(isWinner()) {
            return pastSymbol + IS_THE_WINNER;
        }
        if(!isVacant()){
            return GAME_IS_DRAW;
        }
        return null;
    }

    private boolean isInValidPosition(int row, int column) {
        if(getSymbolAt(row, column) == EMPTY_SPACE){
            return false;
        }
        return true;
    }

    public char getSymbolAt(int row, int column) {
        return gameBoard.getSymbolAt(row, column);
    }

    public char currentSymbol(){
        if(pastSymbol != EMPTY_SPACE && pastSymbol == SYMBOL_X)
            return pastSymbol = SYMBOL_O;
        else
            return pastSymbol = SYMBOL_X;
    }

    private boolean isWinner() {
        return isWinIfHorizontalRowOccupiedWithSameSymbol() || isWinIfVerticalColumnOccupiedWithSameSymbol() || hasWinnerDiagonally();
    }

    private boolean isWinIfHorizontalRowOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int row = 0; row < gridlayout[0].length; row++) {
            if (gridlayout[row][0] == gridlayout[row][1] && gridlayout[row][1] == gridlayout[row][2]
                    && gridlayout[row][0] != EMPTY_SPACE) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinIfVerticalColumnOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int column = 0; column < gridlayout[0].length; column++) {
            if (gridlayout[0][column] != EMPTY_SPACE && gridlayout[0][column] == gridlayout[1][column] && gridlayout[1][column] == gridlayout[2][column]) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinIfUpperLeftToLowerRightDiagonalOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][0] != EMPTY_SPACE && gridlayout[0][0] == gridlayout[1][1] && gridlayout[1][1] == gridlayout[2][2]) {
            return true;
        }
        return false;
    }
    private boolean isWinIfUpperRightToLowerLeftDiagonalOccupiedWithSameSymbol() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][2] != EMPTY_SPACE && gridlayout[0][2] == gridlayout[1][1] && gridlayout[1][1] == gridlayout[2][0]) {
            return true;
        }
        return false;
    }
    private boolean hasWinnerDiagonally() {
        return isWinIfUpperLeftToLowerRightDiagonalOccupiedWithSameSymbol() || isWinIfUpperRightToLowerLeftDiagonalOccupiedWithSameSymbol();
    }
}
