package com.joysistvi.day9.forlooping.activity6;

import java.util.Scanner;

public class Activity6Part1_Labin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n== MULTIPLICATION TABLE ==");
        System.out.print("\nEnter the multiplication table you want to display: ");
        int choice = scanner.nextInt();
        int i  = 0;
        int num = choice;
        while (i <= 10) {
            System.out.println(num + " x " + i +" = " + (num*i));
            i++;
        }
    }
}
