package com.joysistvi.day17.methods;

public class JavaMethod {

    public static void main(String[] args) { // condition
        int year = 2026;
        if (year == 2026){
            greet("Aljane", 28);
        } else if ( year == 2027) {
            greet("Aljane", 29);
        }
    }

    // void - doesnt return anything/ walang out put
    public static void greet (String name, int age) {
        printmoboi("Hello my name is " + name);
        printmoboi("I am " + age + " years old.");
    }

    public static void printmoboi(String word) {
        System.out.println(word);

    }

}


/*
 public static void main(String[] args) {
        System.out.println(sum(6, 10));  // INVOKE METHOD
    }

    public static int sum (int a, int b) {
        return a + b; // ginamit dito as exit kasi nakuha na ang value
    }
 */