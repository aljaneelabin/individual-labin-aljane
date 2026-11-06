package com.joysistvi.day20.accessmodifiers.activity13.sample;

import com.joysistvi.day20.accessmodifiers.activity13.UserAccountRegistration;

import java.util.Scanner;

public class MainForSample1 {

    public static void main(String[] args) {
        Sample1 user = new Sample1();
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

        boolean validPassword = false;

        while (!validPassword) {
            System.out.print("Enter your Password: ");
            String password = scanner.nextLine();

            validPassword = user.setPassword(password);

            if (!validPassword) {
                System.out.println("Please try again!\n");
            }
        }
    }
}
