package roland;

import static spark.Spark.*;

public class roland {

    static class Wow {
        int age = 20;
    }

    public static void main(String... arr) {
        Wow wow = new Wow();
        get("/hello", (request, response) -> {
            System.out.println("/hello");
            response.type("application/json");
            response.status(200);
            return wow;
        });
    }
}
