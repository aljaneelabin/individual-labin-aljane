package com.joysistvi.day20.accessmodifiers.b;

import com.joysistvi.day20.accessmodifiers.a.Employee;

public class B extends Employee {

    public static void main(String[] args) {
        B b = new B();
        b.printAge();
        System.out.println(b.age);
    }
}
