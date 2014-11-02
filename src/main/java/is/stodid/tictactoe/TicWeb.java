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
        //result.put("zero",  "&nbsp;");
        //result.put("one",   "&nbsp;");
        //result.put("two",   "&nbsp;");
        //result.put("three", "&nbsp;");
        //result.put("four",  "&nbsp;");
        //result.put("five",  "&nbsp;");
        //result.put("six",   "&nbsp;");
        //result.put("seven", "&nbsp;");
        //result.put("eight", "&nbsp;");
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
                //StringBuffer myParam = new StringBuffer(request.params(":mark"));
                String cell = request.queryParams("cell");
                //String mark = request.queryParams("mark");
                tictactoe.in(cell);
                //result.put(cell, mark);
                //result.put("one", "mark");
                response.redirect("/");
                return null;
            }
        });
    }
}
