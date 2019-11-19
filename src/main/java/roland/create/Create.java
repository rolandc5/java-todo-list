package roland.create;

import org.json.simple.JSONObject;
import java.io.File;
import java.io.IOException;

public class Create {
    public static void write(String name, long age) {
        JSONObject todo = new JSONObject();
        todo.put("name", name);
        todo.put("age", age);
        System.out.println(todo);
    }

    public static String fileExists() throws IOException {
        File file = new File("wow.json");
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("Created file since it didn't exist");
            return "Successfully Created file";
        } else {
            return "File Exists, Reading File";
        }
    }
}
