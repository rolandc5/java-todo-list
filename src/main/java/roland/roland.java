package roland;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import static spark.Spark.*;

public class roland {
    public static void main(String... arr) {
        JSONParser jsonP = new JSONParser();
        get("/", (request, response) -> {
            System.out.println("/");
            response.status(200);
            return "This API is Working.";
        });
        post("/create", (request, response) -> {
            System.out.println("/create");
            JSONObject body = (JSONObject) jsonP.parse(request.body());
            System.out.println(body.get("name"));
            return body;
        });
    }
}
