package com.joysistvi.day11.MTEJavaSE8;

import javax.sound.midi.Soundbank;

public class TV {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        if(stuff.equals("TV")) {
            res = "Samsung";
            System.out.println(res);
        }else if (stuff.equals("Color")) {
            res = "White";
            System.out.println(res);
        }else {
            res = "No result";
            System.out.println(res);
        }

        int x = 10;
        int y = ++x;
        int z = 0;

        if (y>=10 | y <= ++x) {
            z = x;
        }else {
        }
        System.out.println(z);




       /* int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b) ? (a<c) ? a : (b<c)? b:c:x;
        System.out.println(d);
       */

        /*int v2 = 100;
        float flt = (float) y2;

        double y1 = 203.22;
        float flt = y1
        */


    }



}
