package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SteerableSpaceShipTest {

    @Test
    void createSteerableSpaceShip() {
        Pilot pilot = new Pilot("Pilot Maverick");
        SteerableSpaceShip steerableSpaceShip = new SteerableSpaceShip(pilot);
        steerableSpaceShip.getCrewList().forEach(member -> System.out.println(member.toString()));
    }

    @Test
    void cannotCreateSteerableSpaceShipWithNullPilot() {
        assertThrows(IllegalArgumentException.class, () -> new SteerableSpaceShip(null));
    }
}