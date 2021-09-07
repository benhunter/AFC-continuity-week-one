package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipTest {

    @Test
    void createSpaceShip(){
        SpaceShip spaceShip = new SpaceShip();
    }

    @Test
    void fillCrew() {
        SpaceShip spaceShip = new SpaceShip();
        String bobName = "Bob";
        CrewMember bob = new CrewMember(bobName);
        spaceShip.fillCrew(bob);
        assertNotNull(spaceShip.getCrewList());
        String actualName = spaceShip.getCrewList().get(0).getName();
        assertEquals(bobName, actualName);
    }

    @Test
    void travelFastReducesFuelAndCrewMorale() {
        SpaceShip spaceShip = new SpaceShip();
        CrewMember bob = new CrewMember("Bob");
        spaceShip.fillCrew(bob);
        float expectedFuel = 80.0f;
        float expectedMorale = 90.0f;

        spaceShip.travelFast();

        assertEquals(expectedFuel, spaceShip.getFuel());

        // Test morale decreased.
        ArrayList<CrewMember> crewList = spaceShip.getCrewList();
        float actualMorale = 0;
        if (crewList != null && crewList.size() > 0) {
            actualMorale = crewList.get(0).getMorale();
        }
        assertEquals(expectedMorale, actualMorale);
    }

    @Test
    void refuelIncreasesFuelAndDecreasesMorale() {
        SpaceShip spaceShip = new SpaceShip();
        CrewMember bob = new CrewMember("Bob");
        spaceShip.fillCrew(bob);
        float expectedFuel = 150.0f;
        float expectedMorale = 95.0f;

        spaceShip.refuel();

        assertEquals(expectedFuel, spaceShip.getFuel());

        // Test morale decreased.
        ArrayList<CrewMember> crewList = spaceShip.getCrewList();
        float actualMorale = 0;
        if (crewList != null && crewList.size() > 0) {
            actualMorale = crewList.get(0).getMorale();
        }
        assertEquals(expectedMorale, actualMorale);

    }

    @Test
    void takeItEasyReducesFuelAndIncreasesMorale() {
        SpaceShip spaceShip = new SpaceShip();
        CrewMember bob = new CrewMember("Bob");
        spaceShip.fillCrew(bob);
        float expectedFuel = 95.0f;
        float expectedMorale = 120.0f;

        spaceShip.takeItEasy();

        assertEquals(expectedFuel, spaceShip.getFuel());

        // Test morale increased.
        ArrayList<CrewMember> crewList = spaceShip.getCrewList();
        float actualMorale = 0;
        if (crewList != null && crewList.size() > 0) {
            actualMorale = crewList.get(0).getMorale();
        }
        assertEquals(expectedMorale, actualMorale);

    }
}