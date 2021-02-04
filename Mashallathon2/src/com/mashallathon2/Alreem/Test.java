package com.mashallathon2.Alreem;

// import com.mashallathon2.Alreem.Dinosaur;
// import com.mashallathon2.Alreem.AlAhsa;

import java.util.ArrayList;
import com.mashallathon2.organism.Organism;

public class Test {
    public static void main(String[] args) {

        // 1 locaton per group
        // 1 organism per person

        Dinosaur barny = new Dinosaur("barny", 100, 100);
        Dinosaur toot = new Dinosaur("toot", 100, 100);

        ArrayList<Organism> population = new ArrayList<>();
        population.add(barny);
        AlAhsa alahsa = new AlAhsa("Alahsa", 1, population);
        barny.display();
        barny.getHealth();
        barny.eat();
        barny.move();
        barny.sleep();
        barny.attack(toot);

        alahsa.display();
        alahsa.earthquake();
        alahsa.rain();
    }

}