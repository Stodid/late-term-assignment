package is.stodid.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("is.stodid.tictactoe.PlayerTest");
    }
	
    Player p = new Player();
    Player x = new Player(1, "Gisli");
    Player o = new Player(2, "Edda");

    @Test
    public void testPlayerNrIs0() {
    	assertEquals(0, p.player);
    }
    @Test
    public void testPlayerNameIsNull() {
        assertEquals(null, p.playerName);
    }
    @Test
    public void testPlayerIsNr1() {
        assertEquals(1, x.player);
    }
    @Test
    public void testPlayerNameIsGisli() {
        assertEquals("Gisli", x.playerName);
    }
    @Test
    public void testPlayerIsNr2(){
        assertEquals(2, o.player);
    }
    @Test
    public void testPlayerNameIsEdda() {
        assertEquals("Edda", o.playerName);
    }
}
