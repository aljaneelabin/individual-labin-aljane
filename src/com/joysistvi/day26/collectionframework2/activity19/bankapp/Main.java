package com.joysistvi.day26.collectionframework2.activity19.bankapp;

public class Main {

    //Polymorphism
    public static void testAccount (Account account){
        account.displayAccountInfo();
    }

    public static void main(String[] args) {
        //Create
        SavingsAccount savings = new SavingsAccount("Juan Dela Cruz", "1001", 5000.0 );
        CheckingAccount checking = new CheckingAccount("Maria Santos", "2001", 1000.0 );


        System.out.println("===============================");
        System.out.println("         SAVINGS ACCOUNT       ");
        System.out.println("===============================");
        testAccount(savings);

        System.out.println("\n===============================");
        System.out.println("         CHECKING ACCOUNT       ");
        System.out.println("===============================");
        testAccount(checking);

        System.out.println("\n===== Savings Transactions =====");
        savings.deposit(1000);
        savings.withdraw(5800);
        savings.deposit(500, "Birthday gift");
        savings.withdraw(1500, "Rent");

        System.out.println("\n===== Checking Transactions =====");
        checking.withdraw(2500);
        checking.withdraw(1000);

        System.out.println("\n===== Transfer (Savings to Checking) =====");
        savings.transfer(checking, 1000);

        System.out.println("\n===== Interest =====");
        savings.addInterest();




    }






}

/*
OOP CONCEPTS:

1. Encapsulation:
   Account - private variables, getters and setters.

2. Inheritance:
   SavingsAccount and CheckingAccount extend Account.

3. Polymorphism (Overriding):
   displayAccountInfo(), deposit(), withdraw(),
   transfer() and other overridden methods.

4. Polymorphism (Overloading):
   deposit(double amount, String remarks)
   withdraw(double amount, String remarks)

5. Abstraction (Abstract Class):
   Account

6. Abstraction (Interfaces):
   Transaction, Transferable,
   InterestBearing, Overdraftable

7. Constants:
   MIN_BALANCE, INTEREST_RATE, OVERDRAFT_LIMIT
*/
