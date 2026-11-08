package com.joysistvi.day22.inheretance.activity;

import jdk.swing.interop.SwingInterOpUtils;

public class Activity15_Labin {

    public static void main(String[] args) {

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





    }
}
