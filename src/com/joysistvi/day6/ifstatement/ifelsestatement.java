package com.joysistvi.day6.ifstatement;

public class ifelsestatement {

    public static void main(String[] args) {
        //Simple program that identifies if age Valid and Invalid
        int age = 21;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        String result = "";

        // IF ELSE
        if (age >= 18) {
            //if block - execute age is 18 or older
            result = "Valid Age";
        } else {
            result = "Invalid Age";
        }

        System.out.println("Result: " + result);
        System.out.println(age + " is " + result);

    }
}
