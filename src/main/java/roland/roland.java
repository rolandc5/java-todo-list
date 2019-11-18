package roland;

import org.json.simple.JSONObject;
import static spark.Spark.*;

public class roland {

    public static void main(String... arr) {
        get("/", (request, response) -> {
            System.out.println("/");
            response.status(200);
            return "This API is Working.";
        });
        post("/create", (request, response) -> {
            System.out.println("/create");
            Object body = request.body();
            return body;
        });
    }
}
