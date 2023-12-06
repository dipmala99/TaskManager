package com.taskforge;

import java.util.Scanner;

public class TaskListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList taskList = new TaskList(sc);

        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    taskList.addTask();
                    break;
                case 2:
                    taskList.completedTask();
                    break;
                case 3:
                    taskList.removeTask();
                    break;
                case 4:
                    taskList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting Task List. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Task List Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Mark Task as Completed");
        System.out.println("3. Remove Task");
        System.out.println("4. Display Tasks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}
