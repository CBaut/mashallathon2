package com.mashallathon2.group1;

import com.mashallathon2.living.Living;
import com.mashallathon2.organism.Organism;
import java.util.Random; 
public class Panda extends Organism implements Living {
    private String color;
    private int age ;
    public Panda (String name, int health, int energy,String color, int age ) {
        super(name, health, energy);
        this.color=color;
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println("Food : Eat bamboo 🎋");
    }

    @Override
    public void move() {
        int temp_energy =this.getEnergy()-10;
        System.out.println("Energy before moving : "+this.getEnergy());
        this.setEnergy(temp_energy);
        System.out.println("Energy after moving : "+ this.getEnergy());
    }

    @Override
    public void sleep() {
        System.out.println("Sleep : Sleep all day 💤 💤 💤");
    }

    public void showcolor() {
        System.out.println("Color : "+this.color );
    }
    public void showFact() {
        String facts []={"every day they fill their tummies for up to 12 hours, shifting up to 12 kilograms of bamboo!.",
                        "Unlike most other bears, pandas do not hibernate.",
                        "Baby pandas are born pink and measure about 15cm.",
                        "Family time! Female pandas give birth to one or two cubs every two years."};
        Random rand = new Random(); 
        int randNum = rand.nextInt(4); 
        System.out.println("Facts random : "+facts[randNum]);
    }

}