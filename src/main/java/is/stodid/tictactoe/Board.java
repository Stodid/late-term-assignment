package is.stodid.tictactoe;

public class Board{

	private char[][] board;

	public Board(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; i < 3; i++){
				board[i][j] = ' ';
			}
		}
	}
}
