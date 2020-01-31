# TicTacToe

Tic-tac-toe, noughts and crosses, or Xs and Os is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid as per the below depiction. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row is the winner. Game will be considered as 'Draw' when all of the grids are marked.
```
0 1 2
3 4 5
6 7 8
```

# Purpose

  This game is developed using Java programming language using Test Driven Development approach.
 

# Functional cases:
1) Construct a 3X3 matrix
2) Player X will be given first move and selects within a range of 0 to 8
3) Player O will be given next move and selects within a range of 0 to 8
4) Declare player X as winner if horizontally all cells in same row are taken by Player X
5) Declare player X as winner if vertically all cells in same column are taken by Player X
6) Declare player X as winner if diagonally all cells from left to right are taken by Player X
7) Declare player X as winner if diagonally all cells from right to left are taken by Player X
8) Declare player O as winner if horizontally all cells in same row are taken by Player O
9) Declare player O as winner if vertically all cells in same column are taken by Player O
10) Declare player O as winner if diagonally all cells from left to right are taken by Player O
11) Declare player O as winner if diagonally all cells from right to left are taken by Player O
12) Declare as Draw when all cells are filled in the board
13) Display "Please select appropriate range" when an range given is outside of 0 to 8


# Prerequisites
To run this program below softwares needs to be installed
```
Java - Version 1.7 or above
Maven - For Dependency management
JUnit - Version 4.12 (added dependency in pom.xml)
Intellij- Any IDE which supports Java
```