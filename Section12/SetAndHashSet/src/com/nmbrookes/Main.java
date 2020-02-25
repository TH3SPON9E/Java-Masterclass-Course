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
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.Key.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of "+ body.getKey());
        for(HeavenlyBody bodyMoons: body.getSatellites()) {
            System.out.println("\t" + bodyMoons.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("\nAll Moons");
        for(HeavenlyBody moon: moons) {
            System.out.println(moon);
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        solarSystem.put(pluto.getKey(), pluto);
        planets.add(pluto);
        System.out.println("\nAll Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.Key.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.Key.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println("\nSolar System Contains");
        for(HeavenlyBody heavenlyBody: solarSystem.values()) {
            System.out.println(heavenlyBody.toString());
        }

    }
}
