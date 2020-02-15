package com.nmbrookes;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        System.out.println("Customer " + customerName + " already exists.");
        return false;
    }

    public boolean removeCustomer(String customerName) {
        Customer customer = findCustomer(customerName);
        if(customer != null) {
            customers.remove(customer);
            return true;
        }
        System.out.println("Customer " + customerName + " does not exists.");
        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        System.out.println("Customer " + customerName + " does not exists.");
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}