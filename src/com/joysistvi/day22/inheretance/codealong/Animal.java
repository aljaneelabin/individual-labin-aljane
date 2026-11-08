package com.joysistvi.day22.inheretance.codealong;

public class Animal {

    //PARENT / SUPER CLASS

    private String name;
    private int agInMonths;

    public Animal(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgInMonths() {
        return agInMonths;
    }

    public void setAgInMonths(int agInMonths) {
        this.agInMonths = agInMonths;
    }

    public void eat () {
        System.out.println(name + " is eating.");

    }

    // method overriding
    public void makeSound (){
        System.out.println(name + " says: Woof! Woof!.");
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + agInMonths;
    }
}
