package com.joysistvi.day14.string;

public class Activity10_Labin {
    public static void main(String[] args) {
        String word = "Revenge ";

        System.out.println("Word: " + word);
        // 1. contains()
        System.out.println("1. It contains even? " + word.contains("even"));

        // 2. endsWith()
        System.out.println("2. It ends with 'e'? " + word.endsWith("e"));

        // 3. startsWith()
        System.out.println("3. It starts with letter 'R'? " + word.startsWith("R"));

        // 4. indexOf()
        System.out.println("4. What is the index no of 'e'? " + word.indexOf("e"));

        // 5. trim()
        System.out.println("5. " + word.trim());

        // 6. replace()
        System.out.print("6. What word forms when ‘u’ is replaced? ");
        System.out.println(word.replace('g','u'));

        // 7. toCharArray()
        char [] spell = word.toCharArray();
        System.out.println("7. ");
        System.out.println(spell [0]);
        System.out.println(spell [1]);


        System.out.println("\n ** Stretch Goal **  ");

        String country = "Philippines";
        int pCount =  0;
        int vowelCount = 0;

        // FIRST & LAST LETTER
        for (int i = 0; i < country.length(); i++) {
            char letter = country.charAt(i);

            // NUMBER OF P (ALL  CASE)
            if (letter == 'p' || letter == 'P') {
                pCount++;
            }
            char smallLetter = Character.toLowerCase(letter) ;

            // NUMBER OF VOWELS
            if (smallLetter == 'a' || smallLetter == 'e' || smallLetter == 'i' || smallLetter == 'o' || smallLetter == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Country: " + country);
        System.out.println("First character: " + country.charAt(0));
        System.out.println("Last Character: " + country.charAt(country.length()-1));
        System.out.println("Number of P/p: "+ pCount);
        System.out.println("Number of Vowels: "+ vowelCount);
    }
}
