package com.joysistvi.day11.MTEJavaSE8;

public class Q18 {
    public static void main(String[] args) {
        String grade = "B";
        if (grade == "A" || grade == "1") {
            System.out.println("Grade 1");
        } else if (grade == "B") {
            System.out.println("Grade 2");
        } else {
            System.out.println("Grade 3");
        }
        switch (grade) {
            case "A": case "1":
                System.out.println("Grade 1");
                break;
            case "B":
                System.out.println("Grade 2");
                break;
            default:
                System.out.println("Grade 3");
                break;
        }
        switch (grade) {
            case "A":
                System.out.println("Grade 1");
                break;
            case "B":
                System.out.println("Grade 2");
                break;
            default:



        }
    }
}
