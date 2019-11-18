package roland;

import org.json.simple.JSONObject;
import static spark.Spark.get;

public class roland {

    static class Todo {
        public void put(String s) {
        }
    }

    public static void main(String... arr) {
        JSONObject obj = new JSONObject();
        get("/hello", (request, response) -> {
            obj.put("name", "Roland Canuto");
            obj.put("age", 25);
            System.out.println("/hello");
            response.type("application/json");
            response.status(200);
            return obj;
        });
    }
}
