package com.nmbrookes;

public class VipCustomer {
    private String customerName;
    private String customerEmail;
    private double creditLimit;

    public VipCustomer() {
        this("John Doe", "johndoe@email.com", 1000);
    }

    public VipCustomer(String customerName, String customerEmail) {
        this(customerName, customerEmail, 500);
    }

    public VipCustomer(String customerName, String customerEmail, double creditLimit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}