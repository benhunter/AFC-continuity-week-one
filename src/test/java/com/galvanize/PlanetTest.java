package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void createPlanet() {
        String EARTH = "Earth";
        float distanceToNext = 5.0f;
        Planet planet = new Planet(EARTH, distanceToNext);

        assertEquals(EARTH, planet.getName());
        assertEquals(distanceToNext, planet.getDistanceToNext());
    }
}