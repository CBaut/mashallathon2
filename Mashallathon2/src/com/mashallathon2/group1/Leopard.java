package com.mashallathon2.group1;

import com.mashallathon2.living.Living;
import com.mashallathon2.organism.Organism;

public class Leopard extends Organism implements Living {
    private int speed;
    private int age;
    public Leopard(String name, int health, int energy , int speed , int age) {
        super(name, health, energy);
        this.speed = speed;    
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eat: Deer! 🐆 ");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " move: Shoooofff! 🐆  ⬛🐆 ⬛🐆 ");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " sleep: Noooosssssffff 💤 💤 💤");
    }

    public void fight() {
        System.out.println(this.getName() + " fight: with Predators! 🐆 🔥 🐆 ");
    }
    
    public void info() {
        System.out.println(String.format("\n\n%s: %s \n%s: %d \n%s: %d \n%s: %d \n%s: %d \n\n","Name:", getName(),"Age", age ,"Health",getHealth() ,"Energy", getEnergy() ,"Speed", speed) );
    }

}
