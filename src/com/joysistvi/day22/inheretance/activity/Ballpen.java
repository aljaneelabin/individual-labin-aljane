package com.joysistvi.day22.inheretance.activity;

public class Ballpen extends Pen {

    double ballPointSize;

    public Ballpen(String brand, String typeOfPen, double weightInGrams, String inkColor, double ballPointSize) {
        super(brand, typeOfPen, weightInGrams, inkColor);
        this.ballPointSize = ballPointSize;
    }

    public double getBallPointSize() {
        return ballPointSize;
    }

    public void setBallPointSize(double ballPointSize) {
        this.ballPointSize = ballPointSize;
    }

    @Override
    public String toString() {
        return  "Pen Type: Regular Pen \n" +
                "Point Size: " + getBallPointSize() + " mm" + "\n" +
                super.toString() ;
    }
}
