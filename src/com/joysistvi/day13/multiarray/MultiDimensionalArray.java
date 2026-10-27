package com.joysistvi.day13.multiarray;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // to know the index position
        // coordinates: rows & column
        //                      0                1          2        3
        int [][] numbers = { {1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8, 9}, {0},}; // rows
        //                       [row] [column]
       // System.out.println(numbers[1][0]);
            // tawagin ang index
       // System.out.println(numbers[3].length); // rows

        System.out.println("\n// traversing a multi dimensional array using nested for loop");
        for (int rows = 0; rows < numbers.length; rows++) {
            //                      0    <      5
            for (int column = 0; column < numbers [rows].length; column++) {
                //                          0      0
                System.out.println(numbers[rows][column]);
            }
            System.out.println();
        }
        System.out.println("\n// traversing a multi dimensional array using nested for-each loop");
        for (int [] rows: numbers) {
            for (int column : rows) {
                System.out.println(column);
            }
            System.out.println();

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n// declare a multi array with a specified size only");
        String[][] planets = new String[2][5];

        for (int rows = 0; rows < planets.length; rows++) {
            for (int column = 0; column < planets[rows].length; column++ ) {
                System.out.print("Enter Planet [" + (rows + 1) + "][" + (column + 1) + "] :");
                planets[rows][column] = scanner.nextLine();
            }
            System.out.println();
        }
        //print all the elements
        for (String [] rows : planets ) {
            System.out.print("[");
            for (String column : rows) {
                System.out.print(column + " ");
            }
            System.out.println("]");
            System.out.printf("");
        }




    }

}



/* to know the index position
// coordinates: rows & column
int [][] numbers = {
        // 0  1  2  - column
        {1, 2, 3}, // index 0
        {4, 5, 6}, // index 1
        {7, 8, 9}, // index 2
};
//                       [row] [column]
        System.out.println(numbers[2][2]);


          for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers [i].length; j++) {
                System.out.println(numbers[i][j]);

 */




