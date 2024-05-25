import java.util.Scanner;

public class HumanPlayer {
    String name;
    char mark;

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

    boolean isValidMove(int row, int col) {
        return (row >= 0 && row <= 2 && col >= 0 && col <= 2 && TicTacToe.board[row][col] == ' ');
    }
}
