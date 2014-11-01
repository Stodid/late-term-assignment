package is.stodid.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("is.stodid.tictactoe.PlayerTest");
	}
	
	Player p = new Player();
	Player x = new Player("X");
	Player o = new Player("O");

	@Test
	public void testPlayerIsNull() {
		assertEquals(null, p.player);
	}
	@Test
	public void testPlayerIsX(){
		assertEquals("X", x.player);
	}
	@Test
	public void testPlayerIsO(){
		assertEquals("O", o.player);
	}
}
