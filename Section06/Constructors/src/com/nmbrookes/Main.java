package com.nmbrookes;

public class Main {
    public static void main(String[] args) {
        BankAccount accountDefault = new BankAccount(); // Empty Parameters, assigns default variables
        BankAccount accountMR = new BankAccount(12345678, 100, "Mathew Roberts",
                "mathewroberts@email.com", "07987654321"); // Constructor with all parameters
        BankAccount accountRS = new BankAccount("Rebbecca Smith", "rebbecasmith@email.com",
                "07898765432"); // Constructor with partial parameters

        System.out.println("*********VIP**********");

        VipCustomer person1 = new VipCustomer(); // Constructor with no parameters
        System.out.println("VIP: " + person1.getCustomerName());
        System.out.println("Email: " + person1.getCustomerEmail());
        System.out.println("Credit Limit: " + person1.getCreditLimit());
        VipCustomer person2 = new VipCustomer("Sheldon Cooper", "sheldoncooper@email.com"); // Constructor with two of three parameters
        System.out.println("VIP: " + person2.getCustomerName());
        System.out.println("Email: " + person2.getCustomerEmail());
        System.out.println("Credit Limit: " + person2.getCreditLimit());
        VipCustomer person3 = new VipCustomer("Leonard Hofstadter", "leonardhofstadter@email.com", 10000); // Constructor with all parameters
        System.out.println("VIP: " + person3.getCustomerName());
        System.out.println("Email: " + person3.getCustomerEmail());
        System.out.println("Credit Limit: " + person3.getCreditLimit());

//        accountMR.setAccountNumber(12345678);
//        System.out.println("Account number: " + accountMR.getAccountNumber());
//
//        accountMR.setBalance(0);
//        System.out.println(accountMR.getBalance());
//
//        accountMR.setCustomerName("John Doe");
//        System.out.println("Customer: " + accountMR.getCustomerName());
//
//        accountMR.setCustomerEmail("johndoe@email.com");
//        System.out.println("Email: " + accountMR.getCustomerEmail());
//
//        accountMR.setCustomerPhoneNumber("07987654321");
//        System.out.println("Phone Number: " + accountMR.getCustomerPhoneNumber());

        System.out.println("********BankAccounts***********");

        System.out.println("Account number: " + accountMR.getAccountNumber());
        System.out.println("Balance: " + accountMR.getBalance());
        System.out.println("Customer: " + accountMR.getCustomerName());
        System.out.println("Email: " + accountMR.getCustomerEmail());
        System.out.println("Phone Number: " + accountMR.getCustomerPhoneNumber());

        System.out.println("*******************");

        accountMR.deposit(100);
        System.out.println("Balance: " + accountMR.getBalance());

        double withdraw = accountMR.withdraw(50);
        System.out.println("Balance: " + accountMR.getBalance());

        withdraw += accountMR.withdraw(150);
        System.out.println("Balance: " + accountMR.getBalance());

        System.out.println("*******************");

        System.out.println("Account number: " + accountDefault.getAccountNumber());
        System.out.println("Balance: " + accountDefault.getBalance());
        System.out.println("Customer: " + accountDefault.getCustomerName());
        System.out.println("Email: " + accountDefault.getCustomerEmail());
        System.out.println("Phone Number: " + accountDefault.getCustomerPhoneNumber());

        System.out.println("*******************");

        System.out.println("Account number: " + accountRS.getAccountNumber());
        System.out.println("Balance: " + accountRS.getBalance());
        System.out.println("Customer: " + accountRS.getCustomerName());
        System.out.println("Email: " + accountRS.getCustomerEmail());
        System.out.println("Phone Number: " + accountRS.getCustomerPhoneNumber());
    }
}