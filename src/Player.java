package src;

import java.util.Scanner;

abstract class Player {
    String name;
    char mark;

    abstract void makeMove();

    boolean isValidMove(int row, int col) {
        return (row >= 0 && row <= 2 && col >= 0 && col <= 2 && TicTacToe.board[row][col] == ' ');
    }
}
