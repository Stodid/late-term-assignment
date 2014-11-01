package is.stodid.tictactoe;

public class Game {
    private Board b;
    private Player player1;
    private Player player2;
    private int playerNr = 1;

    public Game() {
        b = new Board();
        initPlayers();
    }

    public void initPlayers() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
    }

    /*public void Play() {
        if(b.isWinner() == 0) {
            
        }            
    }*/
}
