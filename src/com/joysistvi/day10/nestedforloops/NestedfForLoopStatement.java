package com.joysistvi.day10.nestedforloops;

public class NestedfForLoopStatement {
    public static void main(String[] args) {
        // syntax of nested for loop
        //3
        // the inner loop excutes completely whenever outer ends completely
        System.out.println("** MULTIPLICATION TABLE **");
        for (int i = 1; i <= 10; i++) { // outerloop
            //              3
            for (int j = 1; j <= 10; j++) {    //innerloop
                System.out.println(i + " * " + j + " = " +(i*j));

            }
            System.out.println();
        }
    }
}
