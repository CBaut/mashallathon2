package com.mashallathon2.group2;

public abstract class Organism {

    private String name;
    private int health;
    private int energy;

    public Organism(String name, int health, int energy) {
        this.name = name;
        this.health = health;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }



}
