package com.joysistvi.day11.MTEJavaSE8;

public class Testing {
    public static void main(String[] args) {
        // Question #17
        int x = 3;
        do{
            System.out.print("*");
            x--;
        }while (x>=0);



        // QUESTION 16
        String [] strs = {"A","B"};
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" and" + idx);
            idx++;
        }
        for (idx = 0; idx< strs.length; idx++) {
            System.out.println("\n" + strs[idx]);
    }

    }

    // Question 15
    String str = "Java";
}
