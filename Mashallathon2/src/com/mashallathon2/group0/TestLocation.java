package com.mashallathon2.group0;

import com.mashallathon2.group1.Panda;
import com.mashallathon2.group2.SusieOrganism;

// import java.util.ArrayList;
// import com.mashallathon2.organism.Organism;

public class TestLocation {
    public static void main(String[] args) {

        // 1 locaton per group
        // 1 organism per person

        // Cat cat = new Cat("Meownica", 100, 100);
        // ArrayList<Organism> housePopulation = new ArrayList<>();
        // housePopulation.add(cat);
        // MyHouse house = new MyHouse("Chris Casa", 1, housePopulation);
        // cat.getName();
        // cat.getHealth();
        // cat.eat();
        // cat.move();
        // cat.sleep();

        // house.getLocationName();
        // house.earthquake();
        // house.rain();

        Panda poe = new Panda("Poe", 1000, 50, "white/black", 101);
        poe.eat();
        poe.showFact();
        poe.showFact();

        SusieOrganism grogu = new SusieOrganism("Grogu", 100, 100, "Space", "Some City", 3434);
        grogu.FaviorteFood("frogs");

        poe.eat(grogu);

    }

}
