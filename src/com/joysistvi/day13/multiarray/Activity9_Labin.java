package com.joysistvi.day13.multiarray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Activity9_Labin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ASK FOR THE NUMBER OF STUDENTS AND SUBJECTS
        System.out.print("\n=========================================================");
        System.out.print("\n                     AVERAGE CALCULATOR                  ");
        System.out.print("\n=========================================================");
        System.out.print("\n");
        System.out.print("\nEnter number of students: ");
        int numberStudents = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numberSubjects = scanner.nextInt();
        scanner.nextLine();

        // SUBJECT NAMES
        String [] subjects = new String[numberSubjects];
        System.out.println("\nEnter subject names ");

        for (int i = 0; i < numberSubjects; i++) {
            System.out.print("Subject " + (i+ 1) + ": ");
            subjects [i] = scanner.nextLine();
        }

        // STUDENT NAMES & GRADES
        String [] studentNames = new String[numberSubjects];
        double [][] grades = new double[numberStudents][numberSubjects];
        double [] averages = new double[numberStudents];

        //INPUT STUDENTS NAMES AND GRADES
        for (int i = 0; i < numberStudents; i++) {
            System.out.print("\nStudent " + (i + 1) + ": ");
            studentNames [i] = scanner.nextLine();
            double total = 0;
            for (int j = 0; j < numberSubjects; j++ ){
                System.out.print("Grade in " + subjects [j] + ":");
                grades [i][j] = scanner.nextDouble();
                total = total + grades [i][j];
            }
            averages[i] = total/numberSubjects;
            scanner.nextLine();
        }
        // FOR DISPLAY OF GRADES REPORT
        System.out.print("\n=========================================================");
        System.out.print("\n                        GRADE REPORT                     ");
        System.out.println("\n========================================================");
        System.out.printf("%-18s", "Student Name");
        for (int j = 0; j < numberSubjects; j++) {
            System.out.printf("%-15s", subjects[j]);
        }
        System.out.printf("%-10s%n", "Average");

        // FOR DISPLAY OF GRADES & AVERAGES
        for (int i = 0; i < numberStudents; i++){
            System.out.printf("%-18s", studentNames[i]);
            for (int j = 0; j < numberSubjects; j++) {
                System.out.printf("%-15.2f", grades[i][j]);
            }
            System.out.printf("%-10.2f%n", averages[i]);
        }
        scanner.close();
    }
}

/*
//      ROW                    0        1       2          0         1       2               0
        String[][] studentNames = { {"Nicole", "Karen", "Arla"}, {"Carol", "Arvin", "Ben",}, {"Mark Anthony"},};
        //     COLUMN                 {         0           }    {           1           }    {      2       }
        String[][] subjects = { {"English", "Filipino", "Mathematics", "Science", "MAPEH", "TLE" }};
        System.out.println(studentNames[1][2]);
        System.out.println(subjects[0][1]);
 */