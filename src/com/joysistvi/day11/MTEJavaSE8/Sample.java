package com.joysistvi.day11.MTEJavaSE8;

public class Sample {
    public static void main(String[] args) {
        // Question #14
        String [][] arr = {{"A", "B","C"},{"D", "E"}};
        for (int i = 0; i <arr.length;i++){
            for (int j=0; j<arr[i].length;j++) {
                System.out.print(arr[i][j] + "");
                if(arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }



        //line n1
        //Question #13
        byte x = 1;
        switch (x) {
        }

        char colorCode = 'y';
        switch (colorCode) {
            case 'r':
                int color = 100;
                break;
            case 'b':
                color = 10;
                break;
            case 'y':
                color = 1;
                break;
        }
        System.out.println("\n"+ colorCode);

    }



}
