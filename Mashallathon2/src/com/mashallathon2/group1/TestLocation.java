package com.mashallathon2.group1;

import java.util.ArrayList;

// import com.mashallathon2.organism.Organism;
import com.mashallathon2.organism.Organism;

public class TestLocation {
    public static void main(String[] args) {
        // Mona
        Panda panda = new Panda("Panda", 100, 100, "black & white", 3);
        ArrayList<Organism> homePopulation = new ArrayList<>();
        homePopulation.add(panda);
        System.out.println("🐼  " + panda.getName() + "  🐼");
        panda.eat();
        panda.move();
        panda.sleep();
        panda.showcolor();
        panda.showFact();

        // Abdullah
        Leopard mLeopard = new Leopard("Fahad 250", 95, 100, 110, 15);
        ArrayList<Organism> housePopulation = new ArrayList<>();
        housePopulation.add(mLeopard);
        System.out.println("");
        System.out.println("🐆 Leopard 🐆 ");
        mLeopard.info();
        mLeopard.fight();
        mLeopard.eat();
        mLeopard.move();
        mLeopard.sleep();

        // Mohammed
        Horse horse = new Horse("Alsham", 100, 100, "Black", "Arabian horse");
        housePopulation.add(horse);
        System.out.println("");
        System.out.println("🐴  Horse 🐴 ");
        System.out.println("Name :" + horse.getName());
        horse.getName();
        horse.getHealth();
        horse.eat();
        horse.move();
        horse.sleep();
        horse.type();
        horse.afterrace();

        // Aishah
        System.out.println("");
        System.out.println("🐰 Rabbit 🐰 ");
        Rabbit rabbit = new Rabbit("Anni", 100, 100, "m2", 3, 33.8);
        housePopulation.add(rabbit);
        rabbit.getHealth();
        rabbit.eat();
        rabbit.move();
        rabbit.sleep();
        rabbit.play();


        // Location
        System.out.println("");
        Khobar myHouse = new Khobar("Khobar st - 250 near the sea", 4, housePopulation, " Big Donut ");
        myHouse.getLocationName();
        myHouse.rain();
        myHouse.todayEvent();
        System.out.println("");
        
        Jeddah house = new Jeddah("Jeddah", 1, housePopulation, "Jeddah race ");
        house.race();
        house.getLocationName();
        house.earthquake();
        house.rain();
    }

}
