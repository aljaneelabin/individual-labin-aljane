package com.joysistvi.day26.collectionframework2.activity19.bankapp;

public abstract class Account {

    //Encapsulation
    private String accountName;
    private String accountNumber;
    private double accountBalance;

    //Constructor
    public Account(String accountName, String  accountNumber, double accountBalance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // Getter & Setter


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // String representation of object
    @Override
    public String toString() {
        return "Account Name: " + accountName  +
                "\nAccount Number: " + accountNumber  +
                "\nAccount Balance: " + accountBalance;
    }

    // ABSTRACTION
    public abstract void displayAccountInfo();


}
