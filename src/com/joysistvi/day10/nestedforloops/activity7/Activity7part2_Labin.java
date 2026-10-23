package com.joysistvi.day10.nestedforloops.activity7;

public class Activity7part2_Labin {
    public static void main(String[] args) {
        System.out.print("\n🧮 MULTIPLICATION TABLE 🧮");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nMultiplication Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }

    }
}
