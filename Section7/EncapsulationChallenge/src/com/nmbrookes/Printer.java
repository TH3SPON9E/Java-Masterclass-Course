package com.nmbrookes;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel < 0) {
            this.tonerLevel = 0;
        }
        else if(tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public void fillToner(int toner) {
        if(toner > 0 && toner <= 100) {
            if((tonerLevel + toner) < 100) {
                this.tonerLevel += toner;
                System.out.println("Toner filled by " + toner);
            }
            if((tonerLevel + toner) > 100) {
                this.tonerLevel = 100;
                System.out.println("Toner filled to max");
            }
        }
        else {
            System.out.println("No toner added");
        }

    }

    public void print(int pages) {
        System.out.println("Printing...");
        if(pages > 0) {
            if(duplex) {
                if(tonerLevel >= 1 && tonerLevel >= pages) {
                    this.printedPages += (pages / 2) + (pages % 2);
                    for(int i = 0; i < pages; i++) {
                        this.tonerLevel -= 1;
                    }
                }
                else {
                    System.out.println("Insufficient Toner");
                }
            }
            else {
                if(tonerLevel >= 1 && tonerLevel >= pages) {
                    this.printedPages += pages;
                    for(int i = 0; i < pages; i++) {
                        this.tonerLevel -= 1;
                    }
                }
                else {
                    System.out.println("Insufficient Toner");
                }
            }
        }
        else {
            System.out.println("Printing Failed");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
