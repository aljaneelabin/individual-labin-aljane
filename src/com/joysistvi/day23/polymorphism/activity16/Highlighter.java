package com.joysistvi.day23.polymorphism.activity16;

public class Highlighter extends Pen {

    private double tipSize;
    private boolean useForHighlight = true;

    public Highlighter (String brand, String typeOfPen, double weightInGrams, String inkColor, double tipSize, boolean useForHighlight) {
        super(brand, typeOfPen, weightInGrams, inkColor);
        this.useForHighlight = useForHighlight;
        this.tipSize = tipSize;
    }

    public boolean isUseForHighlight() {
        return useForHighlight;
    }

    public void setUseForHighlight(boolean useForHighlight) {
        this.useForHighlight = useForHighlight;
    }

    public double getTipSize() {
        return tipSize;
    }

    public void setTipSize(double tipSize) {
        this.tipSize = tipSize;
    }

    // method for highlighter only
    public void highlight (){
        System.out.println("Highlighting important details.");
    }

    //Part 1: Method overriding
    // #2-3
    @Override
    public void refill (){
        System.out.println("Refilling the highlighter ink.");
    }
    @Override
    public void write() {
        System.out.println("Writing boldly with a highlighter.");
    }

    @Override
    public String toString() {
        return "Pen Type: Highlighter\n"
                + super.toString() +
                "Tip Size: " + tipSize + " mm" + "\n" +
                "Does it come in different colors? " + (useForHighlight ? "Yes." : "No.");
    }
}
