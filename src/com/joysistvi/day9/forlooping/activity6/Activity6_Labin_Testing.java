package com.joysistvi.day9.forlooping.activity6;

import java.util.Scanner;

public class Activity6_Labin_Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.print(num + " x " + i +" = " + (num*i) );

        }
    }
}
