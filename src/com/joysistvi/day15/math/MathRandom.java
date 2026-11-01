package com.joysistvi.day15.math;

public class MathRandom {
    public static void main(String[] args) {

       // System.out.println("\n9. Math.random()");//
        // nagbibigay ng random decimal number mula 0 pataas, pero laging mas mababa sa 1
        //System.out.println("\tRandom number: " + Math.random()); // ramdom w/o operation always below 1 ang random
       // System.out.println("\tRandom number: " + Math.random()*10); // from 0 to 10-1
       // System.out.println("\tRandom number: " + (int) (Math.random()*11)); // from 1 to 10 and rwmove the decimal

        //other**
        int [] lotto = new int [6];
        for (int i = 0; i < lotto.length; i++) {    // for loop - to generate lotto numbers
            lotto[i] = (int) (Math.random() * 31) + 1;
            for (int j = 0; j < i; j++) {   // nested - to check if may duplicate
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("\tYour Ez2 Lotto Numbers: " + " ");
        for (int i = 0; i < lotto.length; i++) {    // for loop - to dislay the lotto numbers
            System.out.print(lotto[i] + " ");
        }
    }
}
