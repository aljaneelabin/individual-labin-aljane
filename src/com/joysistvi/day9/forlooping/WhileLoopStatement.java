package com.joysistvi.day9.forlooping;

public class WhileLoopStatement {
    // walang initialization
    // walang increment optional only
    public static void main(String[] args) {
        // this program display even number from 1 to 5;


        int number = 1;
        // 1 <= 5 so limang loop
        while (number <= 5 ) {      //BODY - GINAGAMIT PARA MASALA KUNG ANO YUNG MADIDISPLAY
            if (number % 2 == 0){
                System.out.println(number);
            }
            number++;

        }


        int i = 0;  // ginagamit kapag di mo alam kung ilang beses gagamitin
        while (i <= 10) {
            System.out.println(i + "");
            i++;
        }
        // Print your name
        int lives =5;
        while (lives > 0) {
            System.out.println("Game is Running");
            lives--;

        }

        System.out.println("Game is over!! 😒"); // for emoji - windows key + . (dot)
    }
}
