package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Printer hp = new Printer(0, false);
        hp.fillToner(10);
        hp.print(7);
        System.out.println("Pages printed = " + hp.getPrintedPages());
        System.out.println("Toner level = " + hp.getTonerLevel());
    }
}
