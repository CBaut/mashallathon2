package com.group2;

import java.util.ArrayList;

public class locationTest {
    public static void main(String[] args) {
        // 1 locaton per group
        // 1 organism per person
        
        ArrayList<Integer> housePopulation = new ArrayList<>();
        // add to the array list
        housePopulation.add(5);
        // country, size, population
        Myhouse house1 = new Myhouse("SA", 500, housePopulation);

        // name , health, energy, country , city , age
        SusieOrganism Susie = new SusieOrganism("Sara alghofaili", 60, 20, "SA", "Riyadh", 23);
        Susie.FaviorteFood("pizza");
        Susie.FaviorteMusic("Forever");
        Susie.FaviroteGame("Call of duty & rocket league");

        ShahadOrganism Shahad = new ShahadOrganism("Shahad Dhafer", 70, 50, "SA", "Riyadh", 24);
        Shahad.FaviorteFood("pasta");
        Shahad.FaviorteMusic("Arabic Music ");
        Shahad.FaviroteGame("mario");

        BushraOrganism Bushra = new BushraOrganism("Bushra Alzulfi", 65, 40, "SA", "Taif", 23);
        Bushra.FaviorteFood("pasta");
        Bushra.FaviorteMusic("classical");
        Bushra.FaviroteGame("The last of us");

        SaraOrganism Sara = new SaraOrganism("Sara ", 60, 30, "SA", "Riyadh", 24);
        Sara.FaviorteFood("Shrimp");
        Sara.FaviorteMusic("K-Pop");
        Sara.FaviroteGame("FIFA");

        BahiyahOrganism Bahiyah = new BahiyahOrganism("Bahiyyah Aljohani ", 40, 30, "SA", "Madinah ", 23);
        Bahiyah.FaviorteFood("pasta");
        Bahiyah.FaviorteMusic("Kpop");
        Bahiyah.FaviroteGame("PUBG");

        AljawharahOrganism Aljawharah = new AljawharahOrganism("Aljawhrah Alotaibi ", 50, 40, "SA", "Riyadh ", 23); 
        Aljawharah.FaviorteFood("French fries");
        Aljawharah.FaviorteMusic("Kpop");
        Aljawharah.FaviroteGame("PUBG");

    }
}