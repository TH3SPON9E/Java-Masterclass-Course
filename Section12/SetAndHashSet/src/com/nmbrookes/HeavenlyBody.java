package com.nmbrookes;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTEROID}

    // This is the constructor which passes values and set the variables upon instantiating the object
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    // This method return the double variable for the orbital period
    // The orbitalPeriod is the amount of time the planet orbits around the sun (days).
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    // This method will return a boolean value if the moon was added.
    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    // This method will return a new HashSet and not the original.
    // This allow the current class to be to somewhat immutable. Not allowing another class
    // access to the original Set
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        public static Key makeKey(String name, BodyTypes bodyType) {
            return new Key(name, bodyType);
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) {
                return(this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
