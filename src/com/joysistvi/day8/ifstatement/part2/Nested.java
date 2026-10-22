package com.joysistvi.day8.ifstatement.part2;

public class Nested { // pwede mas mahabang nested depende sa requirement
    public static void main(String[] args) {
        int age = 0;
        String category = "";
        String subCategory = "";

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        }

        if (age <= 2) {
            category = "Baby";
            // 0-1 = Infant
            // 2 = Toddler
            if (age <= 1) {
                subCategory = "Infant";
            } else {
                subCategory = "Toddler";
            }

        } else if (age <= 12) {
            category = "Child";
        } else if (age <= 19) {
            category = "Teenager";
        } else if (age <= 30) {
            category = "Young Adult";
            //
        } else if (age <= 59) {
            category = "Adult";
        } else if (age >=60) {
            category = "Senior";
            // 60 - 75 = Young old senior
            // 76 - 100 = Old Senior
            if (age <= 75) {
                subCategory = "Young Old Senior";
            } else {
                subCategory = "Old Senior";
            }
        }
        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
        System.out.println("Sub Category: " + subCategory);

    }
}



