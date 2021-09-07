package com.galvanize;

import java.util.ArrayList;
import java.util.Map;

public class SolarSystem {
    private String name;
    private SpaceShip spaceShip = new SpaceShip();
    private ArrayList<Planet> planetList = new ArrayList<>();
    private Planet currentPlanet;

    public SolarSystem(String name) {
        this.name = name;
        this.planetList.add(new Planet("Mars", 1f));
        this.planetList.add(new Planet("Venus", 2f));
        this.planetList.add(new Planet("Earth", 3f));
        this.currentPlanet = planetList.get(0);
    }

    public String getName() {
        return this.name;
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
}
