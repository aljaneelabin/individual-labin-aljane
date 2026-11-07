package com.joysistvi.day21.constructor.activity14;

import java.util.Scanner;

public class Activity14_Labin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("*** USER ACCOUNT REGISTRATION ***");
        System.out.println("*********************************");

        System.out.print("\nEnter your First Name: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter your Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your Address: ");
        String address = scanner.nextLine();

       // Email checking
        String email;
        String emailError;

        do {
            System.out.print("Enter your Email: ");
            email = scanner.nextLine();

            emailError = UserAccount.getEmailError(email);

            if (emailError != null) {
                System.out.println(emailError);
                System.out.println("Please try again!\n");
            }
            else {
                System.out.println("\nEmail successfully saved!\n");
            }

        }  while (emailError != null);


        // Password Checking
        String password;
        String passwordError;

        do {
            System.out.print("Enter your Password: ");
            password = scanner.nextLine();

            passwordError = UserAccount.getPasswordError(password);

            if (passwordError != null) {
                System.out.println(passwordError);
                System.out.println("Please try again.\n");
            }
            else {
                System.out.println("\nPassword successfully saved!\n");
            }

        } while (passwordError != null);


        UserAccount userAccount = new UserAccount(firstname, middleName, lastName, address, email, password);

        System.out.println("\n================================");
        System.out.println("===== User Account Details =====");
        System.out.println("================================");
        System.out.println(userAccount);

        scanner.close();
    }
}
