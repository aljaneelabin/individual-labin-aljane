package com.joysistvi.day21.constructor.parameterized;

public class Ballpen2 {
    //1. fields
    // data hiding -> making all data members private
    private String brand = "Panda";
    private String color;
    private double pointSize;
    private double weightInGrams;

    // default constructor
   /* public Ballpen2 () {

    }

    */

    // 2. constructor - special method / parameterized constructor
    // alt + insert to shortcut in setter & getter


    public Ballpen2(String brand, String color, double pointSize, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.pointSize = pointSize;
        this.weightInGrams = weightInGrams;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
  // instead of hash in array - use to string representation of object
    @Override
   /* public String toString() {
        return "Ballpen2{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", pointSize=" + pointSize +
                ", weightInGrams=" + weightInGrams +
                '}';
    }

    */

    // String representation of object
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Color: " + color  + "\n" +
                "Point Size: " + pointSize + "\n" +
                "Weight in Grams: " + weightInGrams;
    }
}
