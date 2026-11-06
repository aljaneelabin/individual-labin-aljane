package com.joysistvi.day20.accessmodifiers.incapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Ballpen Information Program ***");
        System.out.println("Please enter the details below:\n");

        System.out.println("\nEnter brand: ");
        ballpen.setBrand(scanner.nextLine());

        System.out.println("\nEnter color: ");
        ballpen.setColor(scanner.nextLine());

        System.out.println("\nEnter point size: ");
        ballpen.setPointSize(scanner.nextLine());

        System.out.println("\nEnter weight: ");
        ballpen.setWeightInGrams(scanner.nextLine());



        System.out.println("\n=== Ballpen Details ===");

        System.out.println("Brand " + ballpen.getBrand());
        System.out.println("Color " + ballpen.getColor());
        System.out.println("Point Size " + ballpen.getPointSize());
        System.out.println("Weigh in grams " + ballpen.getWeightInGrams());





    }
}
