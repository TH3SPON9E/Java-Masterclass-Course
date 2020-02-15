package com.nmbrookes;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile Phone now on");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing: " + phoneNumber + " on mobile phone.");
        }
        else {
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            if(isOn) {
                isRinging = true;
                System.out.println("Melody Ring");
            }
            else {
                System.out.println("Mobile phone is off");
                isRinging = false;
            }
        }
        else {
            System.out.println("Wrong number");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
