package com.joysistvi.day24.abstraction.activity17;

// Part 1: #1
public abstract class Pen {

    private String brand;
    private String typeOfPen;
    private double weightInGrams;
    private String inkColor;

    //constructor
    public Pen (String brand, String typeOfPen, double  weightInGrams, String inkColor){
        this.brand = brand;
        this.typeOfPen = typeOfPen;
        this. weightInGrams = weightInGrams;
        this.inkColor = inkColor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeOfPen() {
        return typeOfPen;
    }

    public void setTypeOfPen(String typeOfPen) {
        this.typeOfPen = typeOfPen;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    //Part 1: #2
    public abstract void write ();

    //non-abstract
    //Part 1: #5
    public void store () {
        System.out.println("Storing the pen in the pencil case.");
    }

    @Override
    public String toString() {
        return  "Brand: " + brand + "\n" +
                "Weight: " + weightInGrams + " grams" + "\n"+
                "Color: " + inkColor + "\n";
    }

    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen."); // - escape character
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }
}




 /* public void refill () {
        System.out.println("Refilling the pen.");
    }

    */