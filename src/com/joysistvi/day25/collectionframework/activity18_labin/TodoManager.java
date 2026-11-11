package com.joysistvi.day25.collectionframework.activity18_labin;

//#1
import java.util.ArrayList;
import java.util.Scanner;

public interface TodoManager {

    //#2
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    //#3
    // Keeps asking until the user enters a valid integer ** try-catch **
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid Input.");
                System.out.println("Please enter a number only.\n");
            }
        }
    }

    //#4
    public static void showMenu() {
        System.out.println("\n===== TO-DO LIST MANAGER =====");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all tasks");
        System.out.println("0. Exit");
    }
    //#5
    public static void addTask() {
        System.out.print("Enter your task: ");
        String task = scanner.nextLine();

        tasks.add(task);

        System.out.println("\nTask added successfully!\n");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            System.out.println("Add your task here.");
        } else {
            System.out.println("\n==============================");
            System.out.println("          YOUR TASKS          ");
            System.out.println("==============================");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void updateTask() {
        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        int taskNumber = getInput("Enter task number to update: ");

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            System.out.print("Enter new task: ");
            String newTask = scanner.nextLine();

            tasks.set(taskNumber - 1, newTask);

            System.out.println("\nTask updated successfully!");
        } else {
            System.out.println("\nInvalid task number.\n");
        }
    }

    public static void removeTask() {
        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        int taskNumber = getInput("Enter task number to remove: ");
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);

            System.out.println("\nTask removed successfully!");
        } else {
            System.out.println("\nInvalid task number.\n");
        }
    }

    public static void clearTasks() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo tasks yet.");
            System.out.println("Add your task here.");
        } else {
            tasks.clear();
            System.out.println("All tasks cleared!");
        }
    }

    //#6
    public static void main(String[] args) {

        while (true) {

            showMenu();

            int choice = getInput("Enter your choice: ");

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:
                    clearTasks();
                    break;

                case 0:
                    System.out.println("\nExiting....");
                    System.out.println("Thank you for using Todo Manager! ❤️");
                    return;

                default:
                    System.out.println("\nInvalid choice. Please try again.\n");
            }
        }
    }
}
