package com.joysistvi.day27.hushset.program;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "Mark", "Navotas", "09457757123"));
        employeeList.add(new Employee(102, "Anthony", "Malabon", "09233251034"));
        employeeList.add(new Employee(103, "Arcales", "Caloocan", "09327835889"));

        System.out.println("List of Employees: ");
       // employeeList.forEach(employee -> System.out.println(employeeName));
        //employeeList.forEach(System.out::println);



    }
}

/*
    Array List: get, mababa sa memory consumption (default choice)
    magkakatabing data kaya mabagal sya magcollect ng data
    Linked List: add, delete
 */
