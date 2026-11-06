package com.joysistvi.day20.accessmodifiers.activity13;

import java.util.Scanner;

public class Activity13_Labin {

    public static void main(String[] args) {
        UserAccountRegistration user = new UserAccountRegistration();
        Scanner scanner = new Scanner(System.in);


        System.out.println("*********************************");
        System.out.println("*** USER ACCOUNT REGISTRATION ***");
        System.out.println("*********************************");

        System.out.print("\nEnter your First Name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Enter your Middle Name: ");
        user.setMiddleName(scanner.nextLine());

        System.out.print("Enter your Last Name: ");
        user.setLastName(scanner.nextLine());

        System.out.print("Enter your Complete Address: ");
        user.setAddress(scanner.nextLine());

        System.out.print("Enter your Email: ");
        user.setEmail(scanner.nextLine());

        System.out.print("Enter your Password: ");
        user.setPassword(scanner.nextLine());



        System.out.println("\n================================");
        System.out.println("===== User Account Details =====");
        System.out.println("================================");

        System.out.println("First Name: " + user.getFirstName());

        System.out.println("Middle Name: " + user.getMiddleName());

        System.out.println("Last Name: " + user.getLastName());

        System.out.println("Complete: " + user.getAddress());

        System.out.println("Email: " + user.getEmail());

        System.out.println("Password: " + "*".repeat(user.getPassword().length()));
    }
}
