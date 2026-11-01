package com.joysistvi.day16.oopintro;

public class Main {

    public static void main(String[] args) {
        // Class Instantiation - Create an object of a class
        Laptop laptop = new Laptop();
        laptop.brand = "MSI";
        laptop.color = "Gray";
        laptop.weightInKg = 1.3;
        laptop.cpu = "i7";
        laptop.ramInGb = 16;

        laptop.browseInternet();
        laptop.createDocuments();
        laptop.sendMessage();
        laptop.transferFiles();

        Laptop laptop2 = new Laptop();
        laptop2.brand = "ACER";
        laptop2.color = "Black";
        laptop2.weightInKg = 1.5;
        laptop2.cpu = "i5";
        laptop2.ramInGb = 8;

        laptop2.createDocuments();
        laptop2.sendMessage();
        laptop2.transferFiles();


        Laptop laptop3 = new Laptop();
        laptop3.brand = "Huawei";
        laptop3.color = "Silver";
        laptop3.weightInKg = 1.4;
        laptop3.cpu = "i7";
        laptop3.ramInGb = 8;

        laptop3.createDocuments();
        laptop3.transferFiles();
        laptop.browseInternet();
    }
}

// create object