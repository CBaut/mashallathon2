package com.mashallathon2.location;

import java.util.ArrayList;

import com.mashallathon2.organism.Organism;

public abstract class Location {
    private String locationName;
    private int size;
    private ArrayList<Organism> population;

    public Location() {
    }

    // [] generate missing constructor

    public Location(String locationName, int size, ArrayList<Organism> population) {
        this.locationName = locationName;
        this.size = size;
        this.population = population;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Organism> getPopulation() {
        return population;
    }

    public void setPopulation(ArrayList<Organism> population) {
        this.population = population;
    }

}
