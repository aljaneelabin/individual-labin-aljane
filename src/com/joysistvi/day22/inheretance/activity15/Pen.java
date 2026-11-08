package com.joysistvi.day22.inheretance.activity15;

public class Pen {

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

    // method overriding
    public void write (){
        System.out.println("Can be used for writing, but only on paper.");
    }

    @Override
    public String toString() {
        return  "Brand: " + brand + "\n" +
                "Weight: " + weightInGrams + " grams" + "\n"+
                "Color: " + inkColor + "\n";
    }
}
