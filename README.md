# Continuity Project: Week One

Over the coming weeks you will be building a full stack application that will take your skills to the next level! Starting this week, we will be using Java to create the classes that will make up our application. 

The classes you must create are:
 - [ ] A CrewMember class
 - [ ] A Spaceship class to hold your crew and fuel
 - [ ] A Planet class
 - [ ] A SolarSystem class which holds our planets and serves as our game board

The main objective is to:

```terminal
Practice creating Java classes and
methods from scratch and testing their
behavior.
```

## Getting Started


- [x] Fork and Clone this repository:
  - [x] In terminal: `git clone`


## Requirements

This solo sprint is a method of review for the week's important concepts, you are encouraged to go beyond the initial MVP and add your own personal features and flair!

- [x] Create a CrewMember class with:
  - [x] a morale property as a float, defaulting to 100.0f
  - [x] a name property as a string that is set in its constructor

- [ ] Create a SpaceShip class with:
  - [x] a fuel property as a float, defaulting to 100.0f
  - [x] a crewList property as an ArrayList containing CrewMember, defaulting to an empty list
  - [x] a travelFast method, which reduces fuel by 20 and each crew members moral by 10
  - [x] a refuel method, which increases fuel by 50 and reduces each crew members moral by 5
  - [x] a takeItEasy method, which reduces fuel by 5 and increases each crew members moral by 20
  - [x] a fillCrew method, which adds a crewMember to the crewList

- [x] Create a Planet class with:
  - [x] a name property as a string that is set in its constructor
  - [x] a distanceToNext property as an int that is set in its constructor

- [x] Create a SolarSystem class with:
  - [x] a name property as a string that is set in its constructor
  - [x] a ship property as a SpaceShip, initialized as a new instance of a SpaceShip
  - [x] a planetList property as an ArrayList, initialized with at least three new Planet instances.
  - [x] a currentPlanet property as a Planet, initialized as the first Planet in planetList

- [x] Write tests to verify that your Classes behave as you expect

- Take it to the next level. Your journey into outerspace is just beginning!

    - You could create additional subclasses for your SpaceShip and crew, with unique behavior
    - Experiment with game logic and moving your ship across the different planets
    - Add additional functionality, behavior, or methods, to existing classes



## Resources

You may use online resources including the learn content from this week to assist you in creating your classes.
