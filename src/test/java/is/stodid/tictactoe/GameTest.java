package is.stodid.tictactoe;
 
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.stodid.tictactoe.GameTest");
    }

    @Test
    public void testHello() {
        assertEquals("hello!", Game.hello());
    }
}