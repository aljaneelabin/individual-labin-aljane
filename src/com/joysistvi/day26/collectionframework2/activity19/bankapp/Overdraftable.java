package com.joysistvi.day26.collectionframework2.activity19.bankapp;

public interface Overdraftable {

    double OVERDRAFT_LIMIT = 2000.0;

    boolean isWithinOverdraft(double amount);
}
