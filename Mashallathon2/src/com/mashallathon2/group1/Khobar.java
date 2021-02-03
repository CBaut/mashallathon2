package com.mashallathon2.group1;

import java.util.ArrayList;

import com.mashallathon2.liveable.Liveable;
import com.mashallathon2.location.Location;
import com.mashallathon2.organism.Organism;

public class Khobar extends Location implements Liveable {

    private String summerEvents;

    public Khobar(String locationName, int size, ArrayList<Organism> population, String e) {
        super(locationName, size, population);
        this.summerEvents = e;
    }

    @Override
    public void earthquake() {
        System.out.println("\n"+this.getLocationName() + " earthquake: Shake rattle and roll! 🙃");
    }

    @Override
    public void wind() {
        System.out.println("\n"+this.getLocationName() + " wind: 🌬 💨");
    }

    @Override
    public void rain() {
        System.out.println("\n"+this.getLocationName() + " rain: 🌧 ☔️ 🌦");
    }

    public void todayEvent(){
        System.out.println("\n"+getLocationName()+" todayEvent: "+ summerEvents);
    }
}
