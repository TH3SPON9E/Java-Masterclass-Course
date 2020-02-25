package com.nmbrookes;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    // This is the constructor which passes values and set the variables upon instantiating the object
    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    // This method returns the String name
    public String getName() {
        return name;
    }

    // This method return the double variable for the orbital period
    // The orbitalPeriod is the amount of time the planet orbits around the sun (days).
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    // This method will return a boolean value if the moon was added.
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    // This method will return a new HashSet and not the original.
    // This allow the current class to be to somewhat immutable. Not allowing another class
    // access to the original Set
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass(): " + obj.getClass());
        System.out.println("this.getClass(): " + this.getClass());
        if(obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
