package is.stodid.tictactoe;

import java.io.*;

public class Game {

    private static boolean gameover;

    public static void main(String args[]) {
        gameover = false;
        InputStreamReader input  = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        viewGame();
        getInput(reader);
    }

    public static String hello() {
        String greeting = "hello!";
        return greeting;
    }

    public static void viewGame() {
        System.out.println("\n__|__|__\n__|__|__\n  |  |\n");
    }

    public static void getInput(BufferedReader bufreader) {
        String string = "";
        try
        {
            string = bufreader.readLine();
        }
        catch(Exception e)
        {
            System.out.println("caught exception");
        }
        System.out.println("You typed: " + string);
    }

}
