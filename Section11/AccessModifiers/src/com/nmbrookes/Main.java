package com.nmbrookes;

// Access modifiers

// Public: is accessible anywhere (public int x)

// Package-private: is the default access modifier that requires no keyword.
// This is accessible to all classes within it's package but not outside package (int x)

// private: is only accessible with it's class and no other class (private int x)

// Protected: accessible anywhere within its package (like package-private)
// but also accessible to subclasses even in another package (protected int x)

public class Main {

    public static void main(String[] args) {
        Account account = new Account("Will Robinson");
        System.out.println("Account: " + account.getAccountName());
        System.out.println("******************************");
        account.deposit(100);
        // Error cannot deposit 0 or negative amount
        account.deposit(0);
        account.deposit(-100);
        int amount = account.withdraw(50);
        // Cannot withdraw 0 or negative amount
        int amount2 = account.withdraw(0);
        int amount3 = account.withdraw(-100);
        System.out.println("******************************");
        account.showTransaction();
        System.out.println("******************************");
        System.out.println("Account Balance: " + account.getAccountBalance());
    }
}
