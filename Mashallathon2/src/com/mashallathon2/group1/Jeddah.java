package com.mashallathon2.group1;


import java.util.ArrayList;

import com.mashallathon2.liveable.Liveable;
import com.mashallathon2.location.Location;
import com.mashallathon2.organism.Organism;

public class Jeddah extends Location implements Liveable {
    private String race ;
    public Jeddah(String locationName, int size, ArrayList<Organism> population,String r) {
        super(locationName, size, population);
        race = r;
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

    public void race (){
        System.out.println(this.getLocationName()+" she win the big race "+ race);
    }

}