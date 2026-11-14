package com.joysistvi.day26.collectionframework2.activity19.bankapp;

public class SavingsAccount extends Account implements Transactions, Transferable, InterestBearing {

    public static final double MIN_BALANCE = 500.0;

    //Constructor
    public SavingsAccount (String accountName, String accountNumber, double accountBalance){

        super(accountName, accountNumber, accountBalance);
    }

    @Override
    public void displayAccountInfo () {
        System.out.println(toString());
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
        System.out.println("Minumum Balance: " + "P" + MIN_BALANCE);
    }

    //Deposit
    @Override
    public void deposit (double amount){
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        setAccountBalance(getAccountBalance() + amount);

        System.out.println("Deposited: " + amount );
        System.out.println("New Balance: " + getAccountBalance() );
    }

    // Withdraw
    @Override
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (getAccountBalance() - amount < MIN_BALANCE) {

            System.out.println(
                    "Withdrawal failed: balance cannot go below "
                            + MIN_BALANCE
            );

            return false;
        }

        setAccountBalance(getAccountBalance() - amount);

        System.out.println("Withdrew " + amount);
        System.out.println("New balance: " + getAccountBalance());

        return true;
    }

    // Transfer
    @Override
    public boolean transfer(Transactions target, double amount) {

        System.out.println("Transferring " + amount + "...");

        if (withdraw(amount)) {

            target.deposit(amount);

            System.out.println("Transfer successful.");

            return true;
        }

        System.out.println("Transfer failed.");

        return false;
    }

    // Add-Interest
    @Override
    public void addInterest() {

        double interest = getAccountBalance() * INTEREST_RATE / 100;

        setAccountBalance(getAccountBalance() + interest);

        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + getAccountBalance());;
    }

    // Method Overloading
    public void deposit(double amount, String remarks) {

        deposit(amount);

        System.out.println("Remarks: " + remarks);
    }

    public boolean withdraw(double amount, String remarks) {

        boolean success = withdraw(amount);

        System.out.println("Remarks: " + remarks);

        return success;
    }


}
