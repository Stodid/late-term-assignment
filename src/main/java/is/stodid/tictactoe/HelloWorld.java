package is.stodid.tictactoe;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication{ 
    public void init() {
        Spark.get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
    }
    public static void main(String[] args) {
        SparkApplication hello = new HelloWorld();
        hello.init();
    }
}
