package roland;

import org.json.simple.JSONObject;
import static spark.Spark.*;

public class roland {

    public static void main(String... arr) {
        port(8080);
        get("/", (request, response) -> {
            System.out.println("/");
            response.status(200);
            return "This API is Working.";
        });
        get("/create", (request, response) -> {
            System.out.println("/create");
            JSONObject obj = new JSONObject();
            obj.put("name", "Roland Canuto");
            obj.put("age", 25);
            obj.put("name", "omg");
            obj.put("age", 22);
            return obj;
        });
    }
}
