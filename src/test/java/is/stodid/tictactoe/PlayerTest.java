package is.stodid.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("is.stodid.tictactoe.PlayerTest");
    }
	
    Player x = new Player(1);
    Player o = new Player(2);

    @Test
    public void testPlayerIsNr1() {
        assertEquals(1, x.player);
    }
    @Test
    public void testPlayerIsNr2(){
        assertEquals(2, o.player);
    }
}
