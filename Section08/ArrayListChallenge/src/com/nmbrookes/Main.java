package com.nmbrookes;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("07123456789");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("Enter choice (6 to see available choices): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }
    }

    private static void addContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact number");
        String number = scanner.nextLine();
        Contact contact = Contact.createContact(name, number);
        if(mobile.addContact(contact)) {
            System.out.println("New contact added -> " + name + ": " + number);
        }
        else {
            System.out.println("Cannot add " + name + ": name already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobile.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobile.updateContact(existingContact, newContact)) {
            System.out.println("Record updated");
        }
        else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact contact = mobile.queryContact(name);
        if(contact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobile.removeContact(contact)) {
            System.out.println("Contact removed");
        }
        else {
            System.out.println("Error removing contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact contact = mobile.queryContact(name);
        if(contact == null) {
            System.out.println("Contact not found");
        }
        else {
            System.out.println("Contact found -> " + contact.getName() +
                    ": " + contact.getNumber());
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if a contact exists\n" +
                "6 - to print list of actions");
        System.out.println("Choose your action: ");
    }
}
