package com.joysistvi.day20.accessmodifiers.incapsulation;

public class Ballpen {

    // data hiding -> making all data members private
    private String brand = "Panda";
    private String color;
    private double pointSize;
    private double weightInGrams;

    //getter method for brand
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public double getPointSize(){
        return pointSize;
    }
    public double getWeightInGrams(){
        return weightInGrams;
    }



    //setter method for brand
    public void setBrand (String brand)  {  // set as parameter
        this.brand = brand;
    }
    public void setColor (String color)  {
        this.brand = color;
    }
    public void setPointSize (String pointSize)  {
        this.brand = pointSize;
    }
    public void setWeightInGrams (String weightInGrams)  {
        this.brand = weightInGrams;
    }

}
