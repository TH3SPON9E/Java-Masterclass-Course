package com.nmbrookes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        System.out.println("Branch " + branchName + " already exists");
        return false;
    }

    public boolean removeBranch(String branchName) {
        if(findBranch(branchName) != null) {
            int index = findBranchIndex(branchName);
            this.branches.remove(index);
            return true;
        }
        System.out.println("Branch: " + branchName + " does not exist");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            if(existingBranch.addCustomer(customerName, initialAmount)) {
                existingBranch.addCustomer(customerName, initialAmount);
                return true;
            }
        }
        System.out.println("Branch " + branchName + " does not exists.");
        return false;
    }

    public boolean removeCustomer(String branchName, String customerName) {
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            if(existingBranch.removeCustomer(customerName)) {
                existingBranch.removeCustomer(customerName);
                return true;
            }
            return false;
        }
        System.out.println("Branch " + branchName + " does not exists.");
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            if(existingBranch.addTransaction(customerName, amount)) {
                existingBranch.addTransaction(customerName, amount);
                return true;
            }
            return false;
        }
        System.out.println("Branch " + branchName + " does not exists.");
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < branches.size(); i ++) {
            Branch branch = this.branches.get(i);
            if(branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    private int findBranchIndex(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Branch " + branch.getBranchName() + " customers: ");
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println((i + 1) + ". " + customer.getCustomerName());
                if(showTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("Transaction " + (j + 1) + ": " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        System.out.println("Branch " + branchName + " does not exists.");
        return false;
    }

    public void showBranches() {
        for(int i = 0; i < branches.size(); i++) {
            System.out.println((i + 1) + ": " + branches.get(i).getBranchName());
        }
    }

    public String getBankName() {
        return bankName;
    }
}