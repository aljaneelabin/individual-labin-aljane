package com.joysistvi.day18.methodsday2;

public class ReturnKeywordExample {

    // method that concatenates string
    public static void main(String[] args) {
        String fullname = createFullName("Aljane", "Labin" );
        System.out.println("Fullname: " + fullname);
        System.out.println(createGreeting("Aljane"));

    }

    public static String createGreeting (String name) {
        return "Hello, " + name + "! Welcome to Java";
    }

    public static String createFullName (String firstName, String lastName){
        return  firstName + " " + lastName;
    }




}
