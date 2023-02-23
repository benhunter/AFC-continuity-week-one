package com.galvanize;

public class CrewMember implements HasMorale {
    private final String name;
    private float morale;

    public CrewMember(String name) {
        this.name = name;
        this.morale = 100.0f;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public float getMorale() {
        return this.morale;
    }

    @Override
    public void decreaseMorale(float amountToReduce) {
        this.morale -= amountToReduce;
    }

    @Override
    public void increaseMorale(float amountToIncrease) {
        this.morale += amountToIncrease;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "name='" + name + '\'' +
                ", morale=" + morale +
                '}';
    }
}
