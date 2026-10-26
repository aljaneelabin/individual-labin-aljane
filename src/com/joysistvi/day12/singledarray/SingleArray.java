package com.joysistvi.day12.singledarray;

public class SingleArray {

    public static void main(String[] args) {
        // syntax
        // age = 24, 26, 28, 30, 17

        // indices:    0   1    2   3   4
        int [] ages = { 24, 26,  30, 38, 17, 50, 60} ; // elements

        // invoke element
        System.out.println(ages [2]);

        // get the length of an array
        System.out.println(ages.length);

        // traverse an array using for-loop
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages [i]); // elements ang tatawain ni index
        }

        // traverse an array using for each loop - ang need lang is yung variable & data type
        // kung gusto madaanan lahat
            // pinapasa ang 1st element
         //    user define
        for (int age : ages) {
            System.out.println(age);
        }



    }

}
