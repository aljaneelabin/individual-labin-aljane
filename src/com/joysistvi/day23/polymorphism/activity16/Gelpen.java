package com.joysistvi.day23.polymorphism.activity16;

public class Gelpen extends Ballpen {

    private String series;
    private boolean waterproof;


    public Gelpen(String brand, String typeOfPen, double weightInGrams, String inkColor, double ballPointSize, String series, boolean waterproof) {
        super(brand, typeOfPen, weightInGrams, inkColor, ballPointSize);
        this.series = series;
        this.waterproof = waterproof;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    // a method use for Gel Pen Only
    public void sign (){
        System.out.println(getBrand() + " " + series + " is more suitable for signing.");
    }

    @Override
    public String toString() {
        return "Pen Type: Gelpen \n" +
                super.toString().substring(super.toString().indexOf("\n") + 1) +
                "\nSeries: " + getSeries() + "\n" +
                "Is this water proof? " + (waterproof ? "Yes." : "No.");
    }
}





