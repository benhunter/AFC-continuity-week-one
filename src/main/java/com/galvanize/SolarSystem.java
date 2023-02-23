package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SolarSystem {
    public static final int MAX_RANDOM_PLANETS = 10;
    private final String name;
    private SpaceShip spaceShip = new SpaceShip();
    private final ArrayList<Planet> planetList;
    private Planet currentPlanet;

    public SolarSystem(String name) {
        this(name,
            new ArrayList<>(Arrays.asList(
                new Planet("Mars", 1f),
                new Planet("Venus", 2f),
                new Planet("Earth", 3f)
            ))
        );
    }

    public SolarSystem(String name, ArrayList<Planet> planetArrayList) {
        this.name = name;
        this.planetList = planetArrayList;
        this.currentPlanet = planetList.get(0);
    }

    public String getName() {
        return this.name;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    public SpaceShip getSpaceShip() {
        return this.spaceShip;
    }

    public ArrayList<Planet> getPlanetList() {
        return (ArrayList<Planet>) this.planetList.clone();  // shallow copy
    }

    public Planet getCurrentPlanet() {
        return this.currentPlanet;
    }

    public static SolarSystem generateRandomSolarSystem() {
        String randomSolarSystemName = Util.generateRandomAlphaString(5) +
                " " + Util.generateRandomAlphaString(7);
        int randomNumberOfPlanets = (new Random()).nextInt(MAX_RANDOM_PLANETS);
        ArrayList<Planet> planetArrayList = new ArrayList<Planet> ();
        for (int i = 0; i < randomNumberOfPlanets; i++) {
            planetArrayList.add(Planet.generateRandomPlanet());
        }

        return new SolarSystem(randomSolarSystemName, planetArrayList);
    }

}
