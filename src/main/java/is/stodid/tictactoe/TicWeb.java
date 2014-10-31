package is.stodid.tictactoe;

import java.util.HashMap;
import java.util.Map;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import spark.template.freemarker.*;
import spark.ModelAndView;

public class TicWeb implements SparkApplication{ 
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
        get(new Route("/tic") {
            @Override
            public Object handle(Request request, Response response) {
                return "Tac!";
            }
        });

        get(new FreeMarkerRoute("/") {
            @Override
            public ModelAndView handle(Request request, Response response) {
                Map<String, String> result = new HashMap<String, String>();
                result.put("one", "1");
                result.put("two", "2");
                result.put("three", "3");
                result.put("four", "4");
                result.put("five", "5");
                result.put("six", "6");
                result.put("seven", "7");
                result.put("eight", "8");
                result.put("nine", "9");
                return modelAndView(result, "game.ftl");
            }
        });
    }
}
