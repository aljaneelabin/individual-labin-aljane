package com.joysistvi.day12.singledarray;

import java.util.Scanner;

public class ArraySampleWithSizeOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        // datatype variable = new datatype [size]
        System.out.println("Enter six colors:");
        String [] colors = new String[6];
        for (int i =0; i < colors.length; i++) {
            System.out.print("Enter color [" + (i + 1) + "]: ");
            colors [i] = sc.nextLine();
        }
        // read after write
        System.out.println("\n Printing all the colors:");
        for (String color : colors) {
            System.out.println(color + ", ");
        }


    }
}
