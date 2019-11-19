package roland;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import static spark.Spark.*;

public class roland {
    public static void main(String... arr) {
        JSONParser jsonP = new JSONParser();

        //Get Request to see if API is working.
        get("/", (request, response) -> {
            System.out.println("/");
            response.status(200);
            return "This API is Working.";
        });

        //Post request to create a new todo.
        post("/create", (request, response) -> {
            System.out.println("/create");
            JSONObject body = (JSONObject) jsonP.parse(request.body());
            String name = (String) body.get("name");
            long age = (long) body.get("age");
            if (name.length() == 0 || age == 0) {
                response.status(400);
                return "Missing Fields";
            } else {
                response.status(200);
                return "Created Successfully";
            }
        });
    }
}
