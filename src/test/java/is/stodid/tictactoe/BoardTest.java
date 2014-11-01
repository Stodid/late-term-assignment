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
		public void isEmpty(){
			assertEquals(false, b.isBoardFull());
		}
	/*@Test
		public void 
*/
}
