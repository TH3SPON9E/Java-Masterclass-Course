package com.nmbrookes;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Enter one Integer");
        this.x = x.nextInt();
    }

    public void x() {
        for(int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " = " + (this.x * x));
        }
    }
}
