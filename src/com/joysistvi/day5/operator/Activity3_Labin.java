package com.joysistvi.day5.operator;

public class Activity3_Labin {
    public static void main(String[] args) {

        // Logical AND Operator (&&)
        System.out.println("Task 2: Event Entry Check");
        int age = 30;
        boolean hasValidID = true;
        boolean allowedToEnter = age >= 18 && hasValidID;
        String result1 = allowedToEnter ? "Yes" : "No";
        System.out.println("Is that person allowed to enter? " + result1);

        // Logical OR Operator (||)
        System.out.println("\nTask 3: Class Status Check");
        boolean isWeekend = true;
        boolean isHoliday = false;
        String result2 = (isWeekend || isHoliday) ? "No" : "Yes";
        System.out.println("Do we have class today? " + result2);

        // Ternary Operator (? :)
        System.out.println("\nTask 4: Pass or Fail Check");
        int score = 90;
        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);

        System.out.println("\nTask 5: Larger Number Check");
        int num = 28;
        int num2 = 30;
        int larger = (num > num2) ? num : num2;
        System.out.println("Number 1: " + num + " , " + "Number 2: " + num2);
        System.out.println("Which number is higher? " + larger);

















    }
}
