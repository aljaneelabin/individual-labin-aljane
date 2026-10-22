package com.joysistvi.day7.ifstatement.part2.userinput;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        //instantiate scanner class / create an object of scanner
        Scanner scanner = new Scanner(System.in);

        // PROMPT THE USER FOR INPUT
        System.out.print("Enter day number (1-7 only): ");

        // get user input using nextInt() and stores to variable day
        int day = scanner.nextInt();
        String dayName = "";
        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        } else {
            // Executes when the day number is invalid
            dayName = "Invalid Day";
        }

        System.out.println(dayName);

        // GET USER INPUT USING nextIn() and stores it to the variable day






    }

}
