package is.stodid.tictactoe;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private int playerNr = 1;

    public Game() {
        board = new Board();
        initPlayers();
    }

    public void initPlayers() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
    }

    public void Play() {
        if(board.isWinner() == 0) {
            
    }
}
