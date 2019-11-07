package com.list;

import java.io.File;

public class List {
    public static String viewTodo() {
        System.out.println("Displaying Todo List");
        return "Hello There";
    };

    public static void createTodo() {
        File file = null;
        boolean bool = false;
        try {
            file = new File("todoList.txt");

            bool = file.createNewFile();

            System.out.println("File created: " +bool);

            file.delete();

            System.out.println("delete() method is invoked");

            bool = file.createNewFile();

            System.out.println("File created: " +bool);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return;
    }
}
