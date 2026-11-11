package com.joysistvi.day24.abstraction.interface_;

// child / subclass
public class Cat extends Animal implements Pet {

    String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }

    // a method that only Cat has
    public void scratch() {
        System.out.println(getName() + " is scratching the sofa.");
    }

    @Override
    public String toString() {
        return "Type: Cat\n"
                + super.toString() + "\n"
                + "Furrcolor: " + furColor;
    }


    @Override
    public void play() {
        System.out.println(getName() + " chases a ball of yarn.");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " purrs and rubs against you.");
    }
}
