package com.joysistvi.day15.math;

import java.util.Scanner;

public class Activity11_Labin {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);  // #4

        // JAVA SCRIPT MATH METHOD

        // ------ BASIC MATH METHODS ------

        System.out.println("\n1. Math.abs() → absolute value");
                // para makuha ang absolute value ng isang number /  Removes the negative sign.
                 //  ang layo nito mula sa zero, kaya positive o zero ang result.
        int amTemp = 29;
        int pmTemp = 23;
        int difference = pmTemp - amTemp; // -6
        System.out.println("\tMorning Temperature: " + amTemp + " degrees");
        System.out.println("\tMorning Temperature: " + pmTemp + " degrees");
        System.out.println("\tDifference Temperature: " + Math.abs(difference) + " degrees");

        System.out.println("\n\t--- For 2 & 3 ---");
        double artist1 = 63.72;
        double artist2 = 52.86;
        double artist3 = 45.67;
        System.out.println(" \tArtist 1" + artist1 + " kg");
        System.out.println(" \tArtist 2" + artist2 + " kg");
        System.out.println(" \tArtist 3" + artist3 + " kg");

        System.out.println("\n2. Math.max() → maximum of two values");
                 // Pinakamataas na value
                // naghahanap ng pinakamalaking number sa mga ibinigay na values. // with if-else

        double heaviest = Math.max(artist1, Math.max(artist2, artist3)); //**
        if (heaviest == artist1) {
            System.out.println("\tThe heaviest is Artist 1 with " + heaviest + " kg");
        }else if (heaviest == artist1) {
            System.out.println("\tThe heaviest is Artistl 2 with " + heaviest + " kg");
        } else {
            System.out.println("\tThe heaviest is Artist 3 with " + heaviest + " kg");
        }

        System.out.println("\n3. Math.min() → minimum of two values");
        double underWeight = Math.min(artist1, Math.min(artist2, artist3))  ; // **
        if (underWeight == artist1) {
            System.out.println("\tThe underweight is Artist 1 with " + underWeight + " kg");
        }else if (underWeight == artist1) {
            System.out.println("\tThe underweight is Artistl 2 with " + underWeight + " kg");
        } else {
            System.out.println("\tThe underweight is Artist 3 with " + underWeight + " kg");
        }
                 // Pinakamababang value
                // naghahanap ng pinakamaliit na number sa mga ibinigay na values


        System.out.println("\n4. Math.pow() → power (exponentiation)");
                 // Exponent o power
                 // para i-raise ang isang number sa isang exponent.
        System.out.println("\t\t == Lot Area Calculator ==");
        // Area = side with exponent 2
        System.out.print("\tEnter the side length of the lot (in meters): ");
        double side = input.nextDouble();
        double area = Math.pow(side, 2); //**
        System.out.println("\tLot side length: " + side + " meters");
        System.out.println("\tLot Area: " + area + " square meters");


        System.out.println("\n5. Math.sqrt() → square root");
            // naghahanap ng square root ng isang number
        System.out.println("\tExample #1");
        System.out.println("\tLot Area: " + area + " square meters");
        double side2 = Math.sqrt(area);
        System.out.println("\tLength of each side: " + side2 + " meters");
        //System.out.println("\tExample #2: Get the Radius");
        //double areaCircle = 169;
        //double radius = Math.sqrt(areaCircle / Math.PI);
        //System.out.println("\nRadius: " + radius);


        // -------- ROUNDING METHODS ------

        System.out.println("\n\t--- For 6, 7 & 8 ---");
        double sales1 = 8000;
        double sales2 = 5600;
        double sales3 = 2500;
        double averageSales = (sales1 + sales2 + sales3) / 3;
        System.out.println("\n6. Math.round() → round to nearest integer");
                // Round to the nearest integer (USUAL ROUNDING OFF METHOD)
        long roundedAverageSales = Math.round(averageSales);  // long na ang ginamit kasi ang goal ay round off sa whole
        System.out.println("\tAverage Sales: " + averageSales);
        System.out.println("\tRounded: " + roundedAverageSales);

        System.out.println("\n7. Math.ceil() → round up (ceiling)");
                // Always round up
                 // nagro-round up sa pinakamalapit na integer na hindi bababa sa original number
        double roundedUp = Math.ceil(averageSales);
        System.out.println("\tAverage Sales: " + averageSales);
        System.out.println("\tRounded Up: " + roundedUp);

        System.out.println("\n8. Math.floor() → round down (floor)");
                // Round down
                // nagro-round down sa pinakamalapit na integer na hindi lalampas sa original number
        double roundedDown = Math.floor(averageSales);
        System.out.println("\tAverage Sales: " + averageSales);
        System.out.println("\tRounded Down: " + roundedDown);

        // ------- RANDOM & EXPONENTIAL METHODS -------

        System.out.println("\n9. Math.random() → random number between 0.0 and 1.0");//
                // nagbibigay ng random decimal number mula 0 pataas, pero laging mas mababa sa 1
        System.out.println("\tRandom number: " + Math.random()); // ramdom w/o operation always below 1 ang random
        System.out.println("\tRandom number: " + Math.random()*10); // from 0 to 10-1
        System.out.println("\tRandom number: " + (int) (Math.random() * 6) + 1); // from 1 to 6 and rwmove the decimal
        int [] lotto = new int [2];
        for (int i = 0; i < lotto.length; i++) {    // for loop - to generate lotto numbers
            lotto[i] = (int) (Math.random() * 31) + 1;
            for (int j = 0; j < i; j++) {   // nested - to check if may duplicate
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("\tYour Ez2 Lotto Numbers: " + "");
        for (int i = 0; i < lotto.length; i++) {    // for loop - to dislay the lotto numbers
            System.out.print(lotto[i] + " ");
        }

        System.out.println("\n\n10. Math.log() → natural logarithm (base e)");
            // kumukuha ng natural logarithm, na may base na e kung saan ang e ≈ 2.71828 humigit-kumulang
            // ginagamit para makuha ang natural logarithm ng isang positive number
        double startingBacteria = 10;
        double targetBacteria = 80;
        double hours = Math.log(targetBacteria / startingBacteria) / Math.log(2); //*
        System.out.println("\tStarting bacteria: " + startingBacteria);
        System.out.println("\tTarget bacteria: " + targetBacteria);
        System.out.println("\tHours needed: " + hours);

        System.out.println("\n11. Math.log10() → logarithm base 10");  //
            // kumukuha ng logarithm na may base na 10
        double number = 1000;
        int digits = (int) Math.log10(number) + 1;

        System.out.println("\tNumber: " + (int) number);
        System.out.println("\tNumber of digits: " + digits);

        System.out.println("\n12. Math.exp() → exponential function (e^x)");   // goal loan interest
            // katumbas ng e2
            // nagko-compute ng e raised to the power na x
            // y gumagamit ng constant na e bilang base
        System.out.println("\t\t == Calculate Loan Balance ==");
        double loan = 10000;
        double interestRate = 0.05; // 5% annual
        double years = 3;
        double totalLoan = loan * Math.exp(interestRate * years);
        double interest = totalLoan - loan;

        System.out.println("\tLoan Amount: PHP " + loan);
        System.out.println("\tInterest Rate: " + (interestRate * 100) + "%");
        System.out.println("\tLoan Period: " + years + " years");
        System.out.println("\tTotal Interest: PHP " + interest);
        System.out.println("\tTotal Loan Balance: PHP " + totalLoan);

        // ------- TRIGONOMETRIC METHODS -------
             // para makuha ang value ng angle
            // ** for refresh **
            // 3 sides of triangle **
            // 1. Hypotenuse — pinakamahabang side, at nasa tapat ng 90-degree angle. (line that connects vertical and horizontal)
            // 2. Opposite — side na nasa tapat ng angle na pinag-uusapan natin. (vertical line)
            // 3. Adjacent — side na katabi ng angle na pinag-uusapan natin, maliban sa hypotenuse. (horizontal line)
        System.out.println("\n\t--- For 13, 14 & 15 ---");
        System.out.println("\tCalculate the height of a ramp using: ");
        double angle = 30;
        double rampLength = 10;
        System.out.println("\tRamp angle: " + angle + " degrees");
        System.out.println("\tRamp length: " + rampLength + " meters");
        System.out.println("\tAngle: " + angle + " degrees");
        System.out.println("\tLength: " + rampLength + " meters");
        System.out.println("\tDistance: " + rampLength + " meters");

        System.out.println("\n13. Math.sin() → sine of an angle (in radians)");
            // FORMULA: Sine = opposite ÷ hypotenuse
        double sin = Math.sin(Math.toRadians(angle));
        System.out.println("\tAngle: " + angle + " degrees");
        System.out.println("\tRamp Length: " + rampLength + " meters");
        System.out.println("\tSin: " + sin);
        System.out.println("\tRamp Height: " + (sin * rampLength) + " meters");

        System.out.println("\n14. Math.cos() → cosine of an angle (in radians)");
            // Cosine = adjacent ÷ hypotenuse
        double cos = Math.cos(Math.toRadians(angle));
        System.out.println("\tCos: " + cos);
        System.out.println("\tHorizontal Distance: " + (cos * rampLength) + " meters");

        System.out.println("\n15. Math.tan() → tangent of an angle (in radians)");
            // Tangent = opposite ÷ adjacent
        double tan = Math.tan(Math.toRadians(angle));
        System.out.println("\tTan: " + tan);
        System.out.println("\tHeight using Tan: " + (tan * (cos * rampLength)) + " meters");






    }
}
