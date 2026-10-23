package com.joysistvi.day10.nestedforloops.jumpackage;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
           // System.out.println(i);

            if (i == 4) {
                continue; // skip this round, but continue looping
            }

            //System.out.println(i);
            System.out.println(i + " Hello");
        }
    }
}

/*         for (int i = 0; i < 10; i++) {
           // System.out.println(i);

            if (i == 4) {
                break; // terminate / stop the loop
            }

            System.out.println(i);
        }

 */