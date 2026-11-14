package com.joysistvi.day28.enums.codealongs;

public class Main {

    public static void main(String[] args) {
        //Accesing an enum values

       // System.out.println(Day.MONDAY);

        Day day = Day.SATURDAY;
        // Enum in switch statement

        switch (day){
            case MONDAY -> System.out.println(Day.MONDAY);
            case TUESDAY -> System.out.println(Day.TUESDAY);
            case WEDNESDAY -> System.out.println(Day.WEDNESDAY);
            case THURSDAY -> System.out.println(Day.THURSDAY);
            case FRIDAY -> System.out.println(Day.FRIDAY);
            case SATURDAY -> System.out.println(Day.SATURDAY);
            case SUNDAY -> System.out.println(Day.SUNDAY);
        }

        //LOOP THROUGH AN ENUM
        System.out.println("Loop through an enum: \n");
        for (Day d : Day.values()){
            System.out.println(d);
        }


    }


}
