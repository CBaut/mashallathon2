package com.mashallathon2.group2;

import java.util.ArrayList;

public abstract class location {
    private String country;
    private int size;
    ArrayList<Integer> population = new ArrayList<Integer>();

    // constructor

    public location(String country, int size, ArrayList<Integer> population) {
        this.country = country;
        this.size = size;
        this.population = population;
    }

    // setter&getter

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Integer> getPopulation() {
        return population;
    }

    public void setPopulation(ArrayList<Integer> population) {
        this.population = population;
    }

}
