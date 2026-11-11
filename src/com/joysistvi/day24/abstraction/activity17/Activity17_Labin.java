package com.joysistvi.day24.abstraction.activity17;

import static com.joysistvi.day23.polymorphism.activity16.Activity16_Labin.testPen;

public class Activity17_Labin {

    public static void main(String[] args) {

        // Create one Ballpen object
        Ballpen ballpen = new Ballpen("HBW", "Regular Pen", 10, "black", 0.5);

        /// Create one Highlighter object
        Highlighter highlighter = new Highlighter("Stabilo", "Highlighter", 19, "Neon Orange", 5, true);

        // PART 4 #11
        // Pen pen = new Pen(...); // ERROR
        // Pen cannot be instantiated because it is an abstract class. Abstract classes cannot create
        // objects directly.

        // PART 4 #13
        System.out.println("\n========= testPen() =========");
        testPen(ballpen);
        System.out.println();
        testPen(highlighter);

        // PART 4 #14
        System.out.println("\n===== testRefillable()  =====");
        testRefillable(ballpen);
        System.out.println();
        testRefillable(highlighter);


        // PART 4 #15
        System.out.println("\n===== testClickable() =====");
        testClickable(ballpen);

        // PART 4 #16
        // testClickable(highlighter); // ERROR

        // This fails because Highlighter does not
        // implement the Clickable interface.
    }


    // PART 4 #13
    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }


    // PART 4 #14
    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum Refills: " + Refillable.MAX_REFILLS);
    }


    // PART 4 #15
    public static void testClickable(Clickable clickable) {
        clickable.click();
    }



}




// it errors because we remove the refill() from Pen and transfer it to interface refillable
// in this way magkakaroon ng refill functionality
// java suggest these 3
// 1. create a method 'refill' in Pen
// 2. create a abstract method 'refill' in Pen
// 3. Rename reference



