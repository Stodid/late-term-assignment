package is.stodid.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BoardTest{

	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("is.stodid.tictactoe.BoardTest");	
	}

	Board b = new Board();

	//A test that compares three integers
	//Since this function has been changed to private,
	//the test has been commented out. Sawry.
	/*@Test
	public void checkThree(){
		assertEquals(true, b.checkThree(1, 1, 1));
	}*/
	//A test to check if our array is empty using isBoardFull.
	@Test
	public void isFull(){
		assertEquals(false, b.isBoardFull());
	}
	//Checks if there is a winner using isWinner
	//Since the board is empty, this should return 0.
	@Test
	public void checkWinner(){
		assertEquals(0, b.isWinner());
	}
	//This is a test to check if there is a win in an empty board.
	@Test
	public void checkWin(){
		assertEquals(false, b.checkWin());
	}
	//Checks if we can insert a mark where a mark has already been put.
	@Test
	public void insertMarkTest(){
		b.board[0][0] = 1;
		assertEquals(false, b.insertMark(0, 2));
	}
	//Testing diagonal win function.
	@Test
	public void checkDiWin(){
		b.board[0][0] = 1;
		b.board[1][1] = 1;
		b.board[2][2] = 1;
		assertEquals(1, b.isWinner());
	}
	//Tesing vertical win function.
	@Test
	public void checkColWin(){
		b.board[0][1] = 2;
		b.board[1][1] = 2;
		b.board[2][1] = 2;
		assertEquals(2, b.isWinner());
	}
	//Testing horizontal win function.
	@Test
	public void checkRowWin(){
		b.board[1][0] = 1;
		b.board[1][1] = 1;
		b.board[1][2] = 1;
		assertEquals(1, b.isWinner());
	}
	//A test to check if the checkWin function works.
	@Test
	public void checkAnyWin(){
		b.board[0][0] = 1;
		b.board[1][1] = 1;
		b.board[2][2] = 1;
		assertEquals(true, b.checkWin());		
	}
	//Is there any winner?
	@Test
	public void checkIsWinner(){
		b.board[0][0] = 1;
		b.board[1][1] = 1;
		b.board[2][2] = 1;
		assertEquals(1, b.isWinner());
	}
	//A test for the isBoardFull function on a full board.
	@Test
	public void checkIsFull	(){
		b.board[0][0] = 1; 
		b.board[0][1] = 1;
		b.board[0][2] = 1;
		b.board[1][0] = 1; 
		b.board[1][1] = 1;
		b.board[1][2] = 1;
		b.board[2][0] = 1; 
		b.board[2][1] = 1;
		b.board[2][2] = 1;
		assertEquals(true, b.isBoardFull());
	}
	//A test for isBoardFull on an empty board
	@Test
	public void checkNotFull(){
		assertEquals(false, b.isBoardFull());
	}
}
