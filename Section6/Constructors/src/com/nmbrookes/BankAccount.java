package com.nmbrookes;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this(12345678, 0, "John Doe", "johndoe@email.com", "00000000000");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = name;
        this.customerEmail = email;
        this.customerPhoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(12345678, 0, customerName, customerEmail, customerPhoneNumber);
    }

    public void setAccountNumber(int number) {
        if(number < 0 || number > 99999999) {
            System.out.println("Invalid Value");
        }
        else {
            this.accountNumber = number;
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double number) {
        if(number <= 0) {
            System.out.println("Invalid Value");
        }
        else {
            this.balance += number;
        }
    }

    public double withdraw(double number) {
        if(number <= 0) {
            System.out.println("Invalid Value");
            return -1;
        }
        else if(this.balance < number) {
            System.out.println("Insufficient Funds");
            return -1;
        }
        else {
            this.balance -= number;
            return number;
        }

    }

    public void setCustomerName(String name) {
        if(name.isEmpty()) {
            this.customerName = "Unknown";
        }
        else {
            this.customerName = name;
        }
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerEmail(String email) {
        if(email.isEmpty()) {
            System.out.println("Invalid Email");
        }
        else {
            this.customerEmail = email;
        }
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhoneNumber(String number) {
        if(number.isEmpty()) {
            System.out.println("Invalid Number");
        }
        else {
            this.customerPhoneNumber = number;
        }
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }
}