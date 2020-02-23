package com.nmbrookes;

// Presenting the Set and HashSet
// One feature of this is that they cannot have multiply values.
// They have methods that are like Lists but unlike lists that are sorted in the order they are added
// Sets do not have an sorted order. Unlike Lists that may have the same value more than once
// Sets do not allow this
// HashSet uses hashes within its set.
// Operations on sets are very fast.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// The example used is a solar system
public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("IO", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // Temp is currently Jupiter

        System.out.println("Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of "+ body.getName());
        for(HeavenlyBody bodyMoons: body.getSatellites()) {
            System.out.println("\t" + bodyMoons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon: moons) {
            System.out.println("\t" + moon.getName());
        }
    }
}
