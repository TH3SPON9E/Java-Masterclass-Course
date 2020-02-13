package com.nmbrookes;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }
    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        String fullName = "";
        if(!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            fullName += firstName + " " + lastName;
        }
        else {
            if(!this.firstName.isEmpty()) {
                fullName += this.firstName ;
            }
            if(!this.lastName.isEmpty()) {
                fullName += this.lastName;
            }
        }

        return fullName;
    }
}
