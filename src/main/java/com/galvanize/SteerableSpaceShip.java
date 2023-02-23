package com.galvanize;

public class SteerableSpaceShip  extends SpaceShip {
    private final Pilot pilot;

    public SteerableSpaceShip(Pilot pilot) {
        super();
        if (pilot == null) throw new IllegalArgumentException("SteerableSpaceShip must have a Pilot.");
        this.pilot = pilot;
        this.fillCrew(pilot);
    }
}
