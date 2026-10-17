package com.joysistvi.day4.operator;

import jdk.swing.interop.SwingInterOpUtils;

public class Activity2_Labin {
    public static void main(String[] args) {

        // INCOME //
        double grossIncome = 50000;

        // EXPENSES //
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // TOTAL EXPENSES //
        double totalExpenses = foodAllowance + transportation + rent +  utilityBill;

        // REMAINING BALANCE //
        double netIncome = grossIncome - totalExpenses;

        // PERCENTAGE FORMULA //
        double foodPercentage = (foodAllowance / grossIncome) * 100;
        double transportationPercentage = (transportation / grossIncome) * 100;
        double rentPercentage = (rent / grossIncome) * 100;
        double utilityPercentage = (utilityBill / grossIncome) * 100;

        System.out.println("** EXPENSES TRACKER **");
        System.out.printf("\nGross Income: ₱%,.0f%n", grossIncome);
        System.out.println("\nLess Expenses: ");
        System.out.printf("Food Allowance: ₱%,.0f%n", foodAllowance);
        System.out.printf("Transportation: ₱%,.0f%n", transportation);
        System.out.printf("Rent: ₱%,.0f%n", rent);
        System.out.printf("Utility Bill: ₱%,.0f%n", utilityBill);
        System.out.printf("Total Expenses: ₱%,.0f%n", totalExpenses);
        System.out.printf("\nNet Income: ₱%,.0f%n", netIncome);
        System.out.println("\nExpenses Percentage:");
        System.out.printf("Food Allowance: %.1f%%%n", foodPercentage);
        System.out.printf("Transportation: %.1f%%%n", transportationPercentage);
        System.out.printf("Rent: %.1f%%%n", rentPercentage);
        System.out.printf("Utility Bill: %.1f%%%n", utilityPercentage);



    }
}
