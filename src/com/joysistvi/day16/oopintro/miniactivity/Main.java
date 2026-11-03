package com.joysistvi.day16.oopintro.miniactivity;

public class Main {

    public static void main(String[] args) {

        // #1
        Cats cats = new Cats ();
        cats.breed = "Persian";
        cats.catName = "Ash";
        cats.catGender = "Male";
        cats.catStages = "Kitten";
        cats.catAgeInMonths = 2;
        cats.color = "Gray";
        cats.weighKilo = 3;

        cats.companion();
        cats.sensitive();
        cats.stressReliever();
        cats.pickyEater();
        cats.loyalty();

        // // #2
        Cats cats2 = new Cats ();
        cats2.breed = "Domestic";
        cats2.catName = "Ginger";
        cats2.catGender = "Female";
        cats2.catStages = "Adult";
        cats2.catAgeInMonths = 13;
        cats2.color = "Golden Brown";
        cats2.weighKilo = 7;

        cats2.companion();
        cats2.sensitive();
        cats2.stressReliever();
        cats2.lowMaintenance();
        cats2.pestControl();
        cats2.loyalty();


        // // #3
        Cats cats3 = new Cats ();
        cats3.breed = "British Shorthair";
        cats3.catName = "Luna";
        cats3.catGender = "Male";
        cats3.catStages = "Kitten";
        cats3.catAgeInMonths = 8;
        cats3.color = "Black";
        cats3.weighKilo = 6;

        cats3.companion();
        cats3.sensitive();
        cats3.stressReliever();
        cats3.pestControl();
        cats3.loyalty();


    }
}
