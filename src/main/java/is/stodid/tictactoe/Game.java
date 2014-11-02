package is.stodid.tictactoe;

public class Game {
    private static Board b;
   // private Player player1;
   // private Player player2;
    private static int playerNr;
    //private int squareNr = 1;

    public Game() {
        b = new Board();
		playerNr = 1;
        //initPlayers();
		// Play();
    }

   /* public void initPlayers() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
    }*/

    public static void play(int squareNr) {
        if(b.isWinner() == 0 || !b.isBoardFull()) {
            if(b.insertMark(squareNr, playerNr)){
				playerNr = switchPlayer(playerNr);
			}
			//else 
			//	continue; þetta er óþarfi
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
	
/*	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Game g = new Game();
				
		}	*/
    public static void in(int square) {
        play(square);
    }

    public static Board out() {
        Board board = b;
        return board;
    }
}
