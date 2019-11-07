package com.roland;

import com.list.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Todo List");
        System.out.println("What would you like to do?");
        System.out.println("Enter a number navigate menu");
        while (userInput != 10) {
            System.out.println("1) Create new Todo");
            System.out.println("2) View Todo List");
            System.out.println("10) Exit Todo List App");
            userInput = in.nextInt();
            switch(userInput) {
                case(1): {
                    System.out.println("Creating new Todo");
                    List.createTodo();
                    break;
                }
                case(2): {
                    System.out.println("Viewing Todo list");
                    List.viewTodo();
                    break;
                }
                case(10): {
                    System.out.println("Exiting todo app, come again!");
                    break;
                }
            }
            System.out.println("\n\n");
        }
    }
}
