package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolarSystemTest {

    @Test
    void createSolarSystem() {
        String name = "Solar System";
        SpaceShip spaceShip = new SpaceShip();
        SolarSystem solarSystem = new SolarSystem(name);
        solarSystem.setSpaceShip(spaceShip);

        assertEquals(name, solarSystem.getName());
        assertNotNull(solarSystem.getSpaceShip());
        assertEquals(3, solarSystem.getPlanetList().size());
        assertEquals(solarSystem.getPlanetList().get(0), solarSystem.getCurrentPlanet());
        assertNotNull(solarSystem.getSpaceShip());
    }

    @Test
    void generateRandomSolarSystem() {
        SolarSystem solarSystem = SolarSystem.generateRandomSolarSystem();
        System.out.println(solarSystem.getName());
        System.out.println(solarSystem.getPlanetList());
        System.out.println(solarSystem.getCurrentPlanet().getName());
        System.out.println(solarSystem.getCurrentPlanet().getDistanceToNext());
    }
}