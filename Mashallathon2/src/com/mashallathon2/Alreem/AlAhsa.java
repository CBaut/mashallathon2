package com.mashallathon2.Alreem;

import java.util.ArrayList;

import com.mashallathon2.liveable.Liveable;
import com.mashallathon2.location.Location;
import com.mashallathon2.organism.Organism;

public class AlAhsa extends Location implements Liveable {
    public AlAhsa(String locationName, int size, ArrayList<Organism> population) {
        super(locationName, size, population);
    }

    @Override
    public void earthquake() {
        System.out.println(this.getLocationName() + "is having an earthquake!!!!");
        // System.out.println("population: "+ getPopulation());
    }

    @Override
    public void wind() {
        System.out.println(this.getLocationName() + " is widy!");
    }

    @Override
    public void rain() {
        System.out.println("rain rain, DON'T go away from "+ this.getLocationName());
    }

    public void display(){
        System.out.println("Alhasa city status:");
        System.out.println("Size: "+getSize());
        // System.out.println("population: "+ getPopulation());
    }

}
