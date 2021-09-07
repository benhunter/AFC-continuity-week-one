package com.galvanize;

public class CrewMember {
    private final String name;
    private float morale;

    public CrewMember(String name) {
        this.name = name;
        this.morale = 100.0f;
    }

    public String getName() {
        return this.name;
    }

    public float getMorale() {
        return this.morale;
    }

    public void reduceMorale(float amountToReduceMorale) {
        this.morale -= amountToReduceMorale;
    }

    public void increaseMorale(float amountToIncreaseMorale) {
        this.morale += amountToIncreaseMorale;
    }
}
