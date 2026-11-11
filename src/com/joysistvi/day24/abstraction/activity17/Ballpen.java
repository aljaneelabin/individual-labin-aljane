package com.joysistvi.day24.abstraction.activity17;

public class Ballpen extends Pen implements Refillable, Clickable {

    private double ballPointSize;

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

    //Method Overriding
    // #2-3
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }


    @Override
    public void click() {
        System.out.println(Clickable.CLICK_SOUND + "The ballpen tip comes out.");
    }

    @Override
    public String toString() {
        return  "Pen Type: Regular Pen \n" +
                super.toString() +
                "Point Size: " + getBallPointSize() + " mm"  ;

    }

    // Part 3 #8
    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }
}
