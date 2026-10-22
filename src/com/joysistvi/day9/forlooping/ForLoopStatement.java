package com.joysistvi.day9.forlooping;

import java.util.Scanner;

public class ForLoopStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Flag variable / boolean flag
        boolean isRunning = true;
        // transfer it to while loop
        while (isRunning) {//gagsamitin to control the loop para mastop
            System.out.println("*   Load Reg *");
            System.out.println("   [1] Text Only!");
            System.out.println("   [2] Call Only!");
            System.out.println("   [3] Call M Text!");
            System.out.println("   [0] Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch  (choice) {
                case 1 -> System.out.println("You are now subscribed to Text Only!\n");
                case 2 -> System.out.println("You are now subscribed to Call Only!\n");
                case 3 -> {
                    System.out.println("You are now subscribed to Call NText Only!\n");
                    isRunning = false;
                }
                case 0 -> {
                    System.out.println("Exiting....");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Input\n");
            }
        }


        // mas ginagamit kapag alam mo ilang beses iloop

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
        }
        for (int i = 10; i >= 10; i--) {   // sa 0 talaga nagstart
            System.out.println(i + " ");
        }
        String name = "Aljane Labin";

        // print the first 10 even number
        for (int i = 1; i <= 20; i++) {
            // System.out.println(i + 1 );
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}

