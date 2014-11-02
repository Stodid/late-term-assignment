package is.stodid.tictactoe;

public class Game {
    private Board b;
    private Player player1;
    private Player player2;
    private int playerNr = 1;
    private int square = 1;

    public Game() {
        b = new Board();
        initPlayers();
        Play();
    }

    public void initPlayers() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
    }

    public void Play() {
        while(b.isWinner() == 0 || !b.isBoardFull()) {
           // if(playerNr == 1)
               // b.insertMark(square, playerNr);
           // else
              //  b.insertMark(square, playerNr);
        }

        if(b.isWinner() == 0 && b.isBoardFull()) {
            System.out.println("Draw!");
        }
        else {
            int winner = b.isWinner();
            System.out.println("Player : " + winner + "has won");
        }
    }
}
