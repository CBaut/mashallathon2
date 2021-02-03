package com.mashallathon2.group1;

import java.util.ArrayList;

import com.mashallathon2.liveable.Liveable;
import com.mashallathon2.location.Location;
import com.mashallathon2.organism.Organism;

public class MyHouse extends Location implements Liveable {
    public MyHouse(String locationName, int size, ArrayList<Organism> population) {
        super(locationName, size, population);
    }

    @Override
    public void earthquake() {
        System.out.println(this.getLocationName() + ": Shake rattle and roll! 🙃");
    }

    @Override
    public void wind() {
        System.out.println(this.getLocationName() + ": 🌬 💨");
    }

    @Override
    public void rain() {
        System.out.println(this.getLocationName() + ": 🌧 ☔️ 🌦");
    }

}
