package com.joysistvi.day6.operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // CONDITION
        //COMPOUND CONDITIONAL STATEMENT - DALAWANG CONDITION SA ISANG STAEMENT
        // need the support
       // int age = 19;
      //  boolean isValidAge = age <= 18;
        // System.out.println(isValidAge);

       // int num = 10;
       // int num2 = 20;
        //logical end && - both condition must be true
        //                  f               t       - FALSE
       // System.out.println(num > num2 && num < num2);

        // or - pag may nakitang true sa statement - TRUE NA
        // PAG PAREHAS FALSE ANG STATEMENT FALSE NA
      //  System.out.println(num > num2 || num < num2);


        // JR HIGH 13-17
        int age = 18;
        //boolean isJuniorHigh = age >= 13 && age < 17;
        //System.out.println(isJuniorHigh);
        boolean isAdult = !(age < 18);
        System.out.println(isAdult);












    }
}
