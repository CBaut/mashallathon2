package com.mashallathon2.Alreem;

import com.mashallathon2.living.Living;
import com.mashallathon2.organism.Organism;

public class Dinosaur extends Organism implements Living {

    public Dinosaur(String name, int health, int energy) {
        super(name, health, energy);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating his food, yummi!");
        setEnergy(getEnergy()+20);
        System.out.println(this.getName() + " energy: "+getEnergy());

    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is moving here and there");
        setHealth(getHealth()-20);
        System.out.println(this.getName() + " health: "+getHealth());
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is sleeping now, hush!");
        setEnergy(getEnergy()+50);
        System.out.println(this.getName() + " energy: "+getEnergy());
    }

    public void attack(Dinosaur dinosaur){
        dinosaur.setHealth(getHealth()-30);
        System.out.println(this.getName() + " has attacked "+dinosaur.getName()+"!!!");
        System.out.println(dinosaur.getName()+" health: "+ dinosaur.getHealth());
    }

    public void display(){
        System.out.println("Dinosaur info:");
        System.out.println("name "+getName());
        System.out.println("health "+getHealth());
        System.out.println("energy "+getEnergy());
    }

}