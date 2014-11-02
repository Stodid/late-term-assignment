package is.stodid.tictactoe;

public class Board{

	public int[][] board = new int[3][3];
	private int winner = 0;

	public Board(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; i < 3; i++){
				board[i][j] = 0;
			}
		}
	}	
	public boolean isBoardFull(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if(board[i][j] == 0){
					return false;
				}
			}	
		}
		return true;
	}
	//isWinner returns the integer value of the player that has won.
	public int isWinner(){
		if(checkWin()){
			return winner;
		}
		return 0;
	}
	//Checks if there is a horizontal, vertical or diagonal win.
	public boolean checkWin(){
		return(rowWin() || columnWin() || diagonalWin());				
	}
	//Compares the three integers in each row and checks if there's a win.
	private boolean rowWin(){
		for (int i = 0; i < 3; i++){
			if(checkThree(board[i][0], board[i][1], board[i][2]) == true){
				return true;
			}
		}
		return false;
	}
	//Compares the three integers in each column and checks if there's a win.
	private boolean columnWin(){
		for (int i = 0; i < 3; i++){
			if(checkThree(board[0][i], board[1][i], board[2][i]) == true){
				return true;
			}
		}
		return false;
	}
	//Compares both diagonal lines and checks if either one has a win.
	private boolean diagonalWin(){
		return(checkThree(board[0][0], board[1][1], board[2][2]) ||
			   checkThree(board[2][0], board[1][1], board[0][2]));
	}
	//Compares three integers to see if they are the same (and not 0).
	private boolean checkThree(int A, int B, int C){
		if(((A == B) && (B == C)) && A != 0){
			winner = A;
			return true;
		}
		return false;
	}
	//Takes an integer and places the current players number in the corresponding square.
	//If there is already a mark in the square, insert mark returns false.
	public boolean insertMark(int squareNum, int player){
		switch(squareNum){
			case 0:
                if(board[0][0] != 0)
                    return false;
                board[0][0] = player;
                break;
			case 1:
                if(board[0][1] != 0)
                    return false;
				board[0][1] = player;
				break;
			case 2:
                if(board[0][2] != 0)
                    return false;
				board[0][2] = player;
				break;
			case 3:
                if(board[1][0] != 0)
                    return false;
				board[1][0] = player;
				break;
			case 4:
                if(board[1][1] != 0)
                    return false;
				board[1][1] = player;
				break;
			case 5:
                if(board[1][2] != 0)
                    return false;
				board[1][2] = player;
				break;
			case 6:
                if(board[2][0] != 0)
                    return false;
				board[2][0] = player;
				break;
			case 7:
                if(board[2][1] != 0)
                    return false;
				board[2][1] = player;
				break;
			case 8:
                if(board[2][2] != 0)
                    return false;
				board[2][2] = player;
				break;
		}
        return true;
	}
}
