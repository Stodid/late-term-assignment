package is.stodid.tictactoe;

public class Game {
    private static Board b;
    private static int playerNr;

    public Game() {
        b = new Board();
		playerNr = 1;
    }

    public static void play(int squareNr) {
        if(b.isWinner() == 0 && !b.isBoardFull()) {
            if(b.insertMark(squareNr, playerNr)){
				playerNr = switchPlayer(playerNr);
			}
        }
        //if(b.isWinner() == 0 && b.isBoardFull()) {
        //    System.out.println("Draw!");
		////	return false;
        //}
        //else {
        //    int winner = b.isWinner();
        //    System.out.println("Player : " + winner + "has won");
		////	return false;
		//}
    }

    public static int switchPlayer(int playerNr) {
        if(playerNr == 1)
            return 2;
        else
            return 1;
    }
	
    public static void in(int square) {
        play(square);
    }

    public static Board out() {
        Board board = b;
        return board;
    }

    public static String status() {
        if(b.isWinner() == 0 && b.isBoardFull()) {
            return "It's a draw!";
        }
        else if(b.isWinner() == 0) {
            return  "It's Player " + playerNr + "'s turn";
        }
        else {
            return "Player " + b.isWinner() + " won!";    
        }
    }
}
