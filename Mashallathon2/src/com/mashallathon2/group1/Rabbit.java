package com.mashallathon2.group1;

import com.mashallathon2.living.Living;
import com.mashallathon2.organism.Organism;

public class Rabbit extends Organism implements Living {
    private String category;
    private int quantity;
    private double speed;
    public Rabbit(String name, int health, int energy, String category, int quantity, double speed) {
        super(name, health, energy);
        this.category=category;
        this.quantity=quantity;
        this.speed=speed;
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + ": eat "+ quantity +" Carrots..");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " moves at " + speed +" km/h");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + ": rrrrrwwzzzzzz 💤 💤 💤");
    }
    
    public void play(){
        System.out.println(category +" " + this.getName() + " play around you!!");
    }
}
