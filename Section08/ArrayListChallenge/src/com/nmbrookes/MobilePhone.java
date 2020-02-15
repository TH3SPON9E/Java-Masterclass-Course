package com.nmbrookes;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println("Contact " + contact.getName() + " not found.");
            return false;
        }
        this.contacts.remove(contact);
        System.out.println("Contact " + contact.getName() + " was found.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " not found.");
            return false;
        }
        else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update not successful.");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(String name) {
        for(int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if(contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact list");
        for(int i = 0; i < this.contacts.size(); i ++) {
            System.out.println((i + 1) + " " + contacts.get(i).getName() +
                    ": " + contacts.get(i).getNumber());
        }
    }
}
