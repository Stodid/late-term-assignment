package is.stodid.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("is.stodid.tictactoe.PlayerTest");
	}
	
	Player p = new Player();

	@Test
	public void testPlayerIsNull() {
		assertEquals(null, p.player);
	}
}
