package is.stodid.tictactoe;

import java.util.HashMap;

public class TicTacToe {
    private static Game game;

    public TicTacToe() {
        game = new Game();
    }

    private static String numtomark(int num) {
        switch (num) {
            case 0:
                return "&nbsp;";
            case 1:
                return "x";
            case 2:
                return "o";
        }
        return "&nbsp;";
    }

    public static void in(String square) {
        game.in(Integer.parseInt(square));
    }
    
    public HashMap<String, String> out() {
        HashMap<String, String> out = new HashMap<String, String>();
        Board b = game.out();
        out.put("zero",  String.valueOf(numtomark(b.board[0][0])));
        out.put("one",   String.valueOf(numtomark(b.board[0][1])));
        out.put("two",   String.valueOf(numtomark(b.board[0][2])));
        out.put("three", String.valueOf(numtomark(b.board[1][0])));
        out.put("four",  String.valueOf(numtomark(b.board[1][1])));
        out.put("five",  String.valueOf(numtomark(b.board[1][2])));
        out.put("six",   String.valueOf(numtomark(b.board[2][0])));
        out.put("seven", String.valueOf(numtomark(b.board[2][1])));
        out.put("eight", String.valueOf(numtomark(b.board[2][2])));

        return out;
    }
}
