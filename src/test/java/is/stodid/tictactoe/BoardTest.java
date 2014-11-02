package is.stodid.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BoardTest{

	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("is.stodid.tictactoe.BoardTest");	
	}

	Board b = new Board();

	@Test
	//A test that compares three integers
	public void checkThree(){
		assertEquals(true, b.checkThree(1, 1, 1));
	}
	@Test
	//A test to check if our array is empty using isBoardFull
	public void isFull(){
		assertEquals(false, b.isBoardFull());
	}
	@Test
	public void checkWinner(){
		assertEquals(0, b.isWinner());
	}
	@Test
	public void checkWin(){
		assertEquals(false, b.checkWin());
	}
	@Test
	public void insertMarkTest(){
		b.board[0][0] = 1;
		assertEquals(false, b.insertMark(0, 2));
	}
	@Test
	public void checkDiWin(){
		b.board[0][0] = 1;
		b.board[1][1] = 1;
		b.board[2][2] = 1;
		assertEquals(true, b.diagonalWin());
	}
	@Test
	public void checkColWin(){
		b.board[0][1] = 1;
		b.board[1][1] = 1;
		b.board[2][1] = 1;
		assertEquals(true, b.columnWin());
	}
	@Test
	public void checkRowWin(){
		b.board[1][0] = 1;
		b.board[1][1] = 1;
		b.board[1][2] = 1;
		assertEquals(true, b.rowWin());
	}
	@Test
	public void checkAnyWin(){
		b.board[0][0] = 1;
		b.board[1][1] = 1;
		b.board[2][2] = 1;
		assertEquals(true, b.checkWin());
		
	}
	@Test
	public void checkIsWinner(){
		b.board[0][0] = 1;
		b.board[1][1] = 1;
		b.board[2][2] = 1;
		assertEquals(1, b.isWinner());
	}
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
	@Test
	public void checkNotFull(){
		assertEquals(false, b.isBoardFull());
	}
}
