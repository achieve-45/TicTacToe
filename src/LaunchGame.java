package src;

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        HumanPlayer p1 = new HumanPlayer("Bob", 'X');

        AIPlayer p2 = new AIPlayer("TAI",'O');

        Player cp = p1;
        int moves = 0;
        final int MAX_MOVES = 9;

        while (true) {
            System.out.println(cp.name + "'s turn");
            cp.makeMove();
            TicTacToe.dispBoard();
            moves++;

            if (TicTacToe.CheckColWin() || TicTacToe.CheckRowWin() || TicTacToe.CheckDiagWin()) {
                System.out.println(cp.name + " has won!");
                break;
            } else if (moves == MAX_MOVES) {
                System.out.println("It's a draw!");
                break;
            } else {
                cp = (cp == p1) ? p2 : p1;
            }
        }





       /* t.dispBoard();
        t.placeMark(0,0,'X');
        t.placeMark(1,2,'O');
        t.placeMark(1,0,'X');
        t.placeMark(1,1,'X');
        t.placeMark(2,0,'0');
        t.placeMark(2,2,'X');
        t.dispBoard();
        System.out.println(t.CheckColWin());
        System.out.println(t.CheckRowWin());
        System.out.println(t.CheckDiagWin());
*/


    }

}
