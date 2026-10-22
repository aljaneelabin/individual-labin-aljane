package com.joysistvi.day8.ifstatement.part2.SwitchStatement;

public class SwtichStatement {
    public static void main(String[] args) {
        String sizeCode = "XSS";
        String sizeDescription = "xs";


        switch (sizeCode) {
            case "XS":
                sizeDescription= "Extra Small";
                break;
            case "S":
                sizeDescription= "Small";
                break;
            case "M":
                sizeDescription= "Mediuml";
                break;
            case "L":
                sizeDescription= "Lsrgr";
                break;
            case "XL":
                sizeDescription= "Extra Large";
                break;
            default:
                sizeDescription = "Invalid Size Code! Please Enter XS, S, M, L, or XL";
        }
        System.out.println("Size: " + sizeDescription);
    }
}


// if (day == 1) {
//            // Executes when day is 1
//            dayName = "Sunday";
//        } else if (day == 2) {
//            // Executes when day is 2
//            dayName = "Monday";
//        } else if (day == 3) {
//            // Executes when day is 3
//            dayName = "Tuesday";
//        } else if (day == 4) {
//            // Executes when day is 4
//            dayName = "Wednesday";
//        } else if (day == 5) {
//            // Executes when day is 5
//            dayName = "Thursday";
//        } else if (day == 6) {
//            // Executes when day is 6
//            dayName = "Friday";
//        } else if (day == 7) {
//            // Executes when day is 7
//            dayName = "Saturday";
//        } else {
//            // Executes when the day number is invalid
//            dayName = "Invalid Day";
//        }
//
//        System.out.println(dayName);
//    }



        //example
//         int day = 1;
//        String dayName = "";
//
//        // a switch  statement evaluate an express
//        // in this case the variable day and matches its value against define 'case' label.
//        // switch pros - malinis tignan
//        // use for exact amount / or range
//        // hindi nya kaya o bawal ang bolean
//        // pwede - byte, short, in
//        // bawal boolean, long, float, double
//
//        switch (day) {
//            case 1:
//                dayName = "Sunday";
//                break;
//            case 2:
//                dayName = "Monday";
//                break;
//            case 3:
//                dayName = "Tuesday";
//                break;
//            case 4:
//                dayName = "Wednesday";
//                break;
//            case 5:
//                dayName = "Thursday";
//                break;
//            case 6:
//                dayName = "Friday";
//                break;
//            case 7:
//                dayName = "Saturday";
//                break;
//            default:
//                dayName = "Invalid Day";
//        }
//        System.out.println("Today is " + dayName);
//    }
//}