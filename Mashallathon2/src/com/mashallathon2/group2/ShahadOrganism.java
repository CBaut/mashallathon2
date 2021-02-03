package com.mashallathon2.group2;

public class ShahadOrganism extends Organism implements Living {

    public int Age;
    public String Country;
    public String City;

    public ShahadOrganism(String name, int health, int energy, String Country, String City, int Age) {
        super(name, health, energy);
        this.Country = Country;
        this.City = City;
        this.Age = Age;

    }

    @Override
    public void FaviroteGame(String Fav) {
        System.out.println("Favirote game : " + Fav);
    }

    @Override
    public void FaviorteMusic(String Favv) {
        System.out.println("Favirote music: " + Favv);
    }

    @Override
    public void FaviorteFood(String Favvv) {
        System.out.println("Favirote food : " + Favvv);
    }

}
