package is.stodid.tictactoe;

public class Player {
	
    int player;
    String playerName;

    public Player(){
        player = 0;
        playerName = null;
    }

    public Player(int player, String playerName){
        this.player = player;
        this.playerName = playerName;
    }
}
