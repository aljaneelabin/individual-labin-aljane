package com.joysistvi.day7.ifstatement;

public class Activity4_Labin {
    public static void main(String[] args) {
        int age = 76;
        String result;

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        }

        if (age <= 2) {
            result = "Baby";
        } else if (age <= 12) {
            result = "Child";
        } else if (age <= 19) {
            result = "Teenager";
        } else if (age <= 29) {
            result = "Young Adult";
        } else if (age <= 59) {
            result = "Adult";
        } else {
            result = "Senior";
        }
        System.out.println("Age: " + age);
        System.out.println("Age Group: " + result);

    }
}