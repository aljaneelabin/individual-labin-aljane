package com.joysistvi.day14.string;

import java.util.Scanner;

public class MiniActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimumTry = 0;
        int maximumTry = 5;

        System.out.print("\n *** Login ***");

        while (minimumTry < maximumTry){
            //Credential
            String correctUsername = "admin";
            String correctPassword = "admin123";


            System.out.print("\nEnter Username: ");
            String username = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            // Validation
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and Password cannot be empty.");
            }

            //Authentication
            if (username.equals(correctUsername) && password.equals(correctPassword) ){
                System.out.println("\nLog in Successfully!");
                System.out.println("Welcome " + username + "!");
                break;
            } else {
                minimumTry ++;
                System.out.println("\nInvalid Username or Password.");
                System.out.println("Access denied!");
            }
            if (minimumTry == maximumTry) {
                System.out.println("You have 5 failed logins!");
                System.out.println("Try another way");
            }
        }
        System.out.println();
    }
}

