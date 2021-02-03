package com.mashallathon2.group0;

import java.util.ArrayList;

import com.mashallathon2.organism.Organism;

public class TestLocation {
    public static void main(String[] args) {

        // 1 locaton per group
        // 1 organism per person

        Cat cat = new Cat("Meownica", 100, 100);
        ArrayList<Organism> housePopulation = new ArrayList<>();
        housePopulation.add(cat);
        MyHouse house = new MyHouse("Chris Casa", 1, housePopulation);
        cat.getName();
        cat.getHealth();
        cat.eat();
        cat.move();
        cat.sleep();

        house.getLocationName();
        house.earthquake();
        house.rain();
    }

}
