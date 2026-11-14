package com.joysistvi.day27.hushset.codealong;

import java.util.HashMap;
import java.util.Map;

public class HashMapCrud {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(2026001, "Aljane");
        students.put(2026002, "Mark");
        students.put(2026003, "Anthony");

        System.out.println("Student 2026002: " + students.get(2026002));

        students.put(2026002, "Olaya");
        System.out.println("Updated 2026002: " + students.get(2026002));

        int searchId = 2026001;
        if (students.containsKey(searchId)){
            System.out.println(searchId + " is enrolled");
        } else {
            System.out.println(searchId + "is not found");
        }

        students.remove(2026003);

        System.out.println("\n Enrolled Student List: ");
        for (int id : students.keySet()) {
            System.out.println(id + " - " + students.get(id));
        }

        students.forEach(( id, name) ->  {  //Lamda
            System.out.println(id + " : " + name );
        });

    }
}

