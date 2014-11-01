package is.stodid.tictactoe;

public class Board{

	private int[][] board;

	public Board(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; i < 3; i++){
				board[i][j] = 0;
			}
		}
	}	
	public boolean isBoardFull(){
		boolean isFull = true;

		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if(board[i][j] == 0){
					isFull = false;
				}
			}	
		}
		return isFull;
	}
	
	public boolean checkWin(){
		return(rowWin() || columnWin() || diagonalWin());				
	}
	
	private boolean rowWin(){
		for (int i = 0; i < 3; i++){
			return(checkThree(board[i][0], board[i][1], board[i][2]));
		}
		return false;
	}
	

	private boolean columnWin(){
		for (int i = 0; i < 3; i++){
			return(checkThree(board[0][i], board[1][i], board[2][i]));
		}
		return true;
	}
	
	private boolean diagonalWin(){
		return(checkThree(board[0][0], board[1][1], board[2][2]) ||
			   checkThree(board[2][0], board[1][1], board[0][2]));
	}
	private boolean checkThree(int A, int B, int C){
		if((A == B) && (B == C)){
			return true;
		}
		return false;
	}
	
	
}
