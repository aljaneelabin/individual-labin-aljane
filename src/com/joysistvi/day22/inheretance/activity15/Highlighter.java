package com.joysistvi.day22.inheretance.activity15;

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

    @Override
    public String toString() {
        return "Pen Type: Highlighter\n"
                + super.toString() +
                "Tip Size: " + tipSize + " mm" + "\n" +
                "Does it come in different colors? " + (useForHighlight ? "Yes." : "No.");
    }
}
