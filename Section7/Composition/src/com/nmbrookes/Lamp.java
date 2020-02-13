package com.nmbrookes;

public class Lamp {
    private String style;
    private boolean battery;
    private int brightness;

    public Lamp(String style, boolean battery, int brightness) {
        this.style = style;
        this.battery = battery;
        this.brightness = brightness;
    }

    public void turnOn() {
        System.out.println("Lamp --> Lamp turning on.");
    }

    public String getStyle() {
        return style;
    }

    public boolean getBattery() {
        return battery;
    }

    public int getBrightness() {
        return brightness;

    }
}
