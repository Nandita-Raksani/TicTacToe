package com.kata.practise;

public class GameBoard {
    char[][] layout;

    public GameBoard() {
        this.layout = new char[3][3];
    }

    public boolean isVacant() {
        for (int row = 0; row < 3; row++)
            for(int column = 0; column < 3; column++)
                if (layout[row][column] != '\0')
                    return false;
        return true;
    }
}
