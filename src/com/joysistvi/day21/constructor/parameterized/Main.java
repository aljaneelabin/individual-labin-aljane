package com.joysistvi.day21.constructor.parameterized;

import java.util.Scanner;

public class Main {
    public class MainBalllpen2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("*** Ballpen Information Program ***");
            System.out.println("Please enter the details below:\n");

            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            System.out.print("Enter point size: ");
            double pointSize = scanner.nextDouble();
            System.out.print("Enter weight in grams: ");
            double weightInGrams = scanner.nextDouble();

            Ballpen2 ballpen = new Ballpen2( brand, color, pointSize, weightInGrams);


            System.out.println("\n=== Ballpen Details ===");
            System.out.println(ballpen);



        }
    }
}
