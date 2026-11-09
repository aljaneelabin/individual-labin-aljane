package com.joysistvi.day23.polymorphism.methodoverloading;

public class Function {
/*
    public void jump (){
        System.out.println("Normal Jump");
    }

    public void jump (int numOfJump){
        System.out.println("Jump" + numOfJump + " x");
    }

    public void jump (int numOfJump, double height){
        System.out.println("Jump" + numOfJump + " x" + height);
    }

    public void jump (int numOfJump, long height, long spin){
        System.out.println("Jump" + numOfJump + " x" + " height" + spin);
    }

 */


    public void jump() {
        System.out.println("Normal Jump");
    }

    public void jump(int noOfJump) {
        System.out.println("Jump " + noOfJump + "x");
    }

    public void jump(long spin) {
        System.out.println("Jump with " + spin + "spin(s)");
    }

    public void jump(int noOfJump, double height) {
        System.out.println("Jump " + noOfJump + "x at" + height + "meter(s) high");
    }

    public void jump(double height, int noOfJump) {
        System.out.println("Jump at" + height + "meter(s) high, repeated " + noOfJump + "x");
    }

    public void jump(double height, int noOfJump, long spin) {
        System.out.println("Jump " + noOfJump + "x at " + height + " meter(s) high with " + spin + " spin(s)");
    }

    public void jump(double height, int noOfJump, long spin, String direction) {
        System.out.println("Jump " + noOfJump + "x at" + height + " meter(s) high with " + spin + "spin(s), facing " + direction);
    }






}
