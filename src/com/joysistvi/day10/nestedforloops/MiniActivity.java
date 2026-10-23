package com.joysistvi.day10.nestedforloops;

public class MiniActivity {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

            }

    }
}

/*   *
     * *
     * * *
     * * * *
     * * * * *
 */