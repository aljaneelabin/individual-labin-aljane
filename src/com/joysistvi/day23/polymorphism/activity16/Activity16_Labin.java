package com.joysistvi.day23.polymorphism.activity16;

public class Activity16_Labin {

    public static void main(String[] args) {

        /*
        Ballpen ballpen = new Ballpen("HBW", "Regular Pen", 10, "black", 0.5 );
        Gelpen gelpen = new Gelpen("Dong-A", "Gel Pen", 12, "Violet", 0.4, "Fine tech", true);
        Highlighter highlighter = new Highlighter("Stabilo", "Highlighter", 19,"Neon Orange",5, true );

        System.out.println("========================");
        System.out.println("        BALLPEN       ");
        System.out.println("========================");
        System.out.println(ballpen);

        System.out.println("========================");
        System.out.println("        GEL PEN         ");
        System.out.println("========================");
        System.out.println(gelpen);
        gelpen.write();
        gelpen.sign();

        System.out.println("\n========================");
        System.out.println("        HIGHLIGHTER       ");
        System.out.println("========================");
        System.out.println(highlighter);
        highlighter.highlight();

         */

        // PART 3: Runtime Polymorphism
        // #5-6

        Pen pen1 = new Ballpen("HBW", "Regular Pen", 10, "black", 0.5 );
        Pen pen2 = new Gelpen("Dong-A", "Gel Pen", 12, "Violet", 0.4, "Fine tech", true);
        Pen pen3 = new Highlighter("Stabilo", "Highlighter", 19,"Neon Orange",5, true );

        System.out.println("\n=======  PEN REFERENCES  =======");


        System.out.println("\n-------------- Pen -------------");
        pen1.write();
        pen1.refill();

        System.out.println("\n------------ Ballpen -----------");
        pen2.write();
        pen2.refill();

        System.out.println("\n---------- Highlighter ---------");
        pen3.write();
        pen3.refill();

        // #8
        System.out.println("\n\n*********  testPen()   ********");

        testPen(pen1);
        System.out.println();

        testPen(pen2);
        System.out.println();

        testPen(pen3);

        // PART 4: Overloading
        // #9
        System.out.println("\n********  Overloading   ********");
        pen3.write("Hello");
        pen3.write("Hello",3);

    }

    // #7
    public static void testPen (Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
    }

}

/* Part 5: Takeaway - Compile-Time vs Runtime Polymorphism
       Compile-Time (Method Overloading)
        - Same method name but different parameters.
        - It chooses the method before running.
        - Focuses on parameters or focuses on what inputs you give to the method (different input).

        Runtime Polymorphism (Method Overriding)
        - The child class changes the parent's method.
        - It chooses the method while running.
        - Focuses on behavior or focuses on what the method does. (Different behavior).

 */



