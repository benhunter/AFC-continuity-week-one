package com.galvanize;

import java.util.ArrayList;

public class SpaceShip {

    private float fuel = 100.0f;
    private ArrayList<CrewMember> crewList = new ArrayList<>();

    public ArrayList<CrewMember> getCrewList() {
        return (ArrayList<CrewMember>) crewList.clone();
    }

    public SpaceShip() {
    }

    public float getFuel() {
        return fuel;
    }

    public void fillCrew(CrewMember bob) {
        crewList.add(bob);
    }

    public void travelFast() {
        this.fuel -= 20f;
        reduceCrewMorale(10.0f);

    }

    public void refuel() {
        this.fuel += 50.0f;
        reduceCrewMorale(5.0f);
    }

    public void takeItEasy() {
        this.fuel -= 5.0f;
        increaseCrewMorale(20.0f);
    }

    private void reduceCrewMorale(float amountToReduce) {
        for (CrewMember member : this.crewList) {
            member.decreaseMorale(amountToReduce);
        }
    }

    private void increaseCrewMorale(float amountToIncrease) {
        for (CrewMember member: this.crewList) {
            member.increaseMorale(amountToIncrease);
        }
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "fuel=" + fuel +
                ", crewList=" + crewList +
                '}';
    }
}
