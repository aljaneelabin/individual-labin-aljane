package com.joysistvi.day26.collectionframework2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkListCrud {

    public static void main(String[] args) {
        List<String> dice = new LinkedList<>();
        System.out.println("*** Color Game ***");
        // Create / Add item(s)
        dice.add("Blue");
        dice.add("Green");
        dice.add("Pink");
        dice.add("White");
        dice.add("Red");
        dice.add("Yellow");

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(dice);
            System.out.println((i + 1) + ". " + dice.get(0));
        }
    }
}

/*
List<String> colors = new LinkedList<>();

        // Create / Add item(s)
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("White");
        colors.add("Red");
        colors.add("Yellow");

        List<String> colors2 = new LinkedList<>();
        colors2.addAll(colors);
       // System.out.println(colors2);

        //shortcut by sir
        List <String> colors3 = new LinkedList<>(colors);
        System.out.println(colors3);



        // Create / Add item(s)
        dice.add("Blue");
        dice.add("Green");
        dice.add("Pink");
        dice.add("White");
        dice.add("Red");
        dice.add("Yellow");
        Collections.shuffle(dice);
        System.out.println(dice.get(0));

        List<String> dice2 = new LinkedList<>();
        dice2.addAll(dice);
        Collections.shuffle(dice2);
        System.out.println(dice2.get(0));

        //shortcut by sir
        List <String> dice3 = new LinkedList<>(dice2);
        Collections.shuffle(dice3);
        System.out.println(dice3.get(0));
 */
