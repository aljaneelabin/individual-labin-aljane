package com.joysistvi.day12.singledarray;

import java.util.Scanner;

public class Activity8_Labin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n ** Enter number here **");
        int [] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            numbers [i] = sc.nextInt();
            sum = sum + numbers [i];
        }
        System.out.println("\n == You entered ==");
        for (int i=0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers [i]);
        }
        double average = (double) sum / numbers.length;
        System.out.println("\nTotal Sum you entered: " + sum);
        System.out.println("\nTotal Average you entered: " + average);

        int highest = numbers[0];
        int lowest = numbers[0];
        for (int i=1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        System.out.println("\nHighest number you entered: " + highest);
        System.out.println("\nLowest number you entered: " + lowest);
    }
}

