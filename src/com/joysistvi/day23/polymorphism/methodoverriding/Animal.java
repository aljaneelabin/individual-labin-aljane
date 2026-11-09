package com.joysistvi.day23.polymorphism.methodoverriding;

public class Animal {

    //PARENT / SUPER CLASS

    private String name;
    private int ageInMonths;

    public Animal(String name, int age) {
        this.name = name;
        this.ageInMonths = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public void eat () {
        System.out.println(name + " is eating.");

    }

    // method overriding
    public void makeSound (){
        System.out.println("Animal makes a sound.");
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + ageInMonths;
    }
}
