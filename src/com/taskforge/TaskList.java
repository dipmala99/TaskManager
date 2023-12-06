package com.taskforge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskList {
     Map<String, Task> tasks;
     Scanner sc;

    public TaskList(Scanner sc) {
        this.tasks = new HashMap<>();
        this.sc = sc;
    }

    public void addTask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();
        System.out.print("Enter task description: ");
        String description = sc.nextLine();
        System.out.print("Enter task category: ");
        String category = sc.nextLine();
        System.out.print("Enter task priority: ");
        String priority = sc.nextLine();
        System.out.print("Enter task due date: ");
        String dueDate = sc.nextLine();

        Task task = new Task(title, description, category, priority, dueDate);
        tasks.put(title, task);
        System.out.println("Task added successfully!");
    }

    public void completedTask() {
        System.out.println("Enter completed task: ");
        String completedTitle = sc.nextLine();
        Task task = tasks.get(completedTitle);

        if (task != null) {
            task.setCompleted(true);
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Task not found!");
        }
    }

    public void removeTask() {
        System.out.print("Enter task title to remove: ");
        String removeTitle = sc.nextLine();
        Task removedTask = tasks.remove(removeTitle);

        if (removedTask != null) {
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
        } else {
            for (Task task : tasks.values()) {
                System.out.println(task);
            }
        }
    }
}
