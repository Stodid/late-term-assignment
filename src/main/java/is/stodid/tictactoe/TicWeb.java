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
        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "Tac!";
            }
        });

        get(new FreeMarkerRoute("/fr") {
            @Override
            public ModelAndView handle(Request request, Response response) {
                Map<String, String> result = new HashMap<String, String>();
                result.put("one", "asdfasdf");
                return modelAndView(result, "asdf.ftl");
            }
        });
    }
}
