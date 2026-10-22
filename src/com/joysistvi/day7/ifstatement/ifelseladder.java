package com.joysistvi.day7.ifstatement;

import org.w3c.dom.ls.LSOutput;

public class ifelseladder {

    public static void main(String[] args) {
        // A;91+  B;81+ C:71+ F:70-

        int grade = 70;
        String result;

        //NESTED IF STATEMENT
        // Validation

        //early exit
        //terminates the method immediately if the grade is outside the valid range

        if (grade >= 1 && grade <= 100) {  // outer if
            // innner if
            if (grade <= 70) { // 1 - 70
                result = "F";
            } else if (grade <= 80) { // 71 - 80
                result = "C";
            } else if (grade <= 90) {
                result = "B";
            } else {
                result = "A";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else {
            System.out.println("Invalid Grade");
        }



       // System.out.println("Grade: " + result);
    }




}

// if elses ladder
            //if (grade <= 70) {
//            result = "F";
//        } else if (grade <= 80) {
//            result = "C";
//        } else if (grade <= 90) {
//            result = "B";
//        } else if (grade <= 100) {
//            result = "A";
//        } else {
//            result = "Invalid Grade";
//        }

