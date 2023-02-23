package com.galvanize;

import java.util.Random;

public class Planet {

    private String name;
    private float distanceToNext;

    public Planet(String name, float distanceToNext) {
        this.name = name;
        this.distanceToNext = distanceToNext;
    }

    public static Planet generateRandomPlanet() {
        return new Planet(generateRandomName(), generateRandomDistance());
    }

    public String getName() {
        return this.name;
    }

    public float getDistanceToNext() {
        return this.distanceToNext;
    }

    private static String generateRandomName() {
        Random random = new Random();
        int randomLength = random.nextInt(10) + 3;
        return Util.generateRandomAlphaString(randomLength);
    }

    private static float generateRandomDistance() {
        Random random = new Random();
        return random.nextFloat() * 100;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceToNext=" + distanceToNext +
                '}';
    }
}
