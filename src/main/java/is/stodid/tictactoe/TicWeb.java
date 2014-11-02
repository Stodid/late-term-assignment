package is.stodid.tictactoe;

import java.util.HashMap;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import spark.template.freemarker.*;
import spark.ModelAndView;

public class TicWeb implements SparkApplication{ 
    private static TicTacToe tictactoe = new TicTacToe();
    private static HashMap<String, String> result = tictactoe.out();

    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication tic = new TicWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        tic.init();
    }
    public void init() {
        get(new FreeMarkerRoute("/") {
            @Override
            public ModelAndView handle(Request request, Response response) {
                result = tictactoe.out();
                return modelAndView(result, "game.ftl");
            }
        });

        post(new FreeMarkerRoute("/mark") {
            @Override
            public Object handle(Request request, Response response) {
                String cell = request.queryParams("cell");
                tictactoe.in(cell);
                response.redirect("/");
                return null;
            }
        });
    }
}
