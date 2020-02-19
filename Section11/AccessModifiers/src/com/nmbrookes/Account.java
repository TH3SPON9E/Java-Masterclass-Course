package com.nmbrookes;

import java.util.ArrayList;

public class Account {
    // Global variables need to be set private so they are accessed via method
    // These methods can the control how the variables are set and got.
    // Without this the variable can be accessed and manipulated without on conditions.
    private String accountName;
    private int accountBalance = 0;
    private ArrayList<Integer> transactions;

    // NOT LIKE THIS

//    public String accountName;
//    public int accountBalance = 0;
//    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        transactions = new ArrayList<Integer>();
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.accountBalance += amount;
            System.out.println(amount + " successfully deposited.");
        }
        else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }

    public int withdraw(int amount) {
        int withdrawal = -amount;
        if(withdrawal < 0) {
            if(accountBalance >= amount) {
                this.accountBalance += withdrawal;
                this.transactions.add(withdrawal);
                System.out.println(amount + " successfully withdrawn.");
            }
            else {
                System.out.println("Insufficient funds in account for this amount.");
            }
        }
        else {
            System.out.println("Cannot withdraw a negative amount.");
        }
        return amount;
    }

    public void showTransaction() {
        for(int i = 0; i < transactions.size(); i++) {
            System.out.println("Transaction " + (i + 1) + ": " + transactions.get(i));
        }
    }
}
