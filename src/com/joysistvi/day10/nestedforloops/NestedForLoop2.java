package com.joysistvi.day10.nestedforloops;

public class NestedForLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            //              1 <= 1
            for (int j = 1; j <= i; j++) {
                System.out.println("\t" + j);
            }
        }
    }
}
