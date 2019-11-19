package roland;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import static spark.Spark.*;
import roland.create.Create;

public class roland {
    public static void main(String... arr) {
        JSONParser jsonP = new JSONParser();
        Create create = new Create();

        //Get Request to see if API is working.
        get("/", (request, response) -> {
            response.status(200);
            return "This API is Working.";
        });

        get("/retrieveTodo", (request, response) -> {
            create.fileExists();

            return "Hello There!";
        });

        // TODO
        // Add a get request to get todo list.
        // Use file.Write and store to local disk

        //Post request to create a new todo.
        post("/create", (request, response) -> {
            JSONObject body = (JSONObject) jsonP.parse(request.body());
            String name = (String) body.get("name");
            long age = (long) body.get("age");
            if (name.length() == 0 || age == 0) {
                response.status(400);
                return "Missing Fields";
            } else {
                create.write(name, age);
                response.status(200);
                return "Created Successfully";
            }
        });
    }
}
