package com.joysistvi.day26.collectionframework2.activity19.bankapp;

public class CheckingAccount extends Account implements Transactions, Transferable, Overdraftable {

    // Constructor
    public CheckingAccount(String accountName, String accountNumber, double accountBalance) {

        super(accountName, accountNumber, accountBalance);
    }

    // Overriding
    @Override
    public void displayAccountInfo() {

        System.out.println(toString());
        System.out.println("Overdraft Limit: " + OVERDRAFT_LIMIT);
    }

    // Check Overdraft
    @Override
    public boolean isWithinOverdraft(double amount) {

        return getAccountBalance() - amount >= -OVERDRAFT_LIMIT;
    }

    // Deposit
    @Override
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        setAccountBalance(getAccountBalance() + amount);

        System.out.println("Deposited " + amount +
                ". New balance: " + getAccountBalance());
    }

    // Withdraw
    @Override
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (!isWithinOverdraft(amount)) {

            System.out.println(
                    "Withdrawal failed: exceeds the overdraft limit of "
                            + OVERDRAFT_LIMIT
            );

            return false;
        }

        setAccountBalance(getAccountBalance() - amount);

        System.out.println("Withdrew " + amount +
                ". New balance: " + getAccountBalance());

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
