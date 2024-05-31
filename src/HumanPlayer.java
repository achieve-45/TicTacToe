package src;

import java.util.Scanner;

public class HumanPlayer extends Player{


    HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        int row, col;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter row and column (0, 1, or 2):");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);
    }


}
