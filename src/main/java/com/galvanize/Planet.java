package com.galvanize;

public class Planet {

    private String name;
    private float distanceToNext;

    public Planet(String name, float distanceToNext) {
        this.name = name;
        this.distanceToNext = distanceToNext;
    }

    public String getName() {
        return this.name;
    }

    public float getDistanceToNext() {
        return this.distanceToNext;
    }
}
