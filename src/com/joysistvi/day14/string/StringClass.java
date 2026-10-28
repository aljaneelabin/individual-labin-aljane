package com.joysistvi.day14.string;

import java.util.Locale;
import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {
        // Login Program
        // equals method of string
        Scanner scanner = new Scanner(System.in);

        while (true){
            //Credential
            System.out.println(" *** Login ***");
            String correctUsername = "admin";
            String correctPassword = "admin123";

            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            // Validation
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and Password cannot be empty.");
            }

            //Authentication
            if (username.equals(correctUsername) && password.equals(correctPassword) ){
                System.out.println("Log in Successfully!");
                System.out.println("Welcome " + username + "!");
            } else {
                System.out.println("Invalid Username or Password.");
                System.out.println("Access denied!");
            }
        }
    }
}




/*
charAt()
// String belng to import java lang - default no need to import
        String word = "Hello" ; // String literal
        // kapag () - method
        // paramater (container) - argument (value) yung nasa loob ng index
        System.out.println(word.charAt(4));

         String middleName = "Escaña" ; // String literal
        char middleInitial = middleName.charAt(0);
        System.out.println(middleInitial);

 length
        String word = "Hello" ; // String literal

        System.out.println(word.length()); // bibilangin ang string

toUpperCase & toLowerCase
        String word = "Hello" ; // String literal

        System.out.println(word.toLowerCase());
         System.out.println(word.toUpperCase());

concat
 String word = "Hello" ; // String literal

        System.out.println(word.concat( "Programming"));

        // Exit program
        System.out.println("Are you sure you want to exit?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.println("\nEnter your Choice: ");
        String choice = String.valueOf(scanner.nextLine().charAt(0));

        if (choice.equalsIgnoreCase("Y")){
            System.out.println("Exiting ...");
        } else {
            System.out.println("Back to Main Menu");

 */