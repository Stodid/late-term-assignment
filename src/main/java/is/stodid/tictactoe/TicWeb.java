package is.stodid.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicWeb implements SparkApplication{ 
    public static void main(String[] args) {
        SparkApplication tic = new TicWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        tic.init();
    }
    public void init() {
        Spark.get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "Tic!";
            }
        });
    }
}
