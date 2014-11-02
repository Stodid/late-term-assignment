package is.stodid.tictactoe;

public class Game {
    private Board b;
    private Player player1;
    private Player player2;
    private int playerNr = 1;
    private int squareNr = 1;

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
            b.insertMark(squareNr, playerNr);
            playerNr = switchPlayer(playerNr);
        }

        if(b.isWinner() == 0 && b.isBoardFull()) {
            System.out.println("Draw!");
        }
        else {
            int winner = b.isWinner();
            System.out.println("Player : " + winner + "has won");
        }
    }

    public int switchPlayer(int playerNr) {
        if(playerNr == 1)
            return 2;
        else
            return 1;
    }
}
