package com.mashallathon2.group1;
import com.mashallathon2.living.Living;
import com.mashallathon2.organism.Organism;

public class Horse extends Organism implements Living {
    private String color ;
    private String typeofhorse;
    

    public Horse (String name, int health, int energy ,String color,String typeofhorse) {
        super(name, health, energy);
        this.color =color;
        this.typeofhorse=typeofhorse;

    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " Food : eat herbs");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " Move : run! ");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " Sleep : hzhzhzhzhzh 💤 💤 💤");
    }

    public void color() {
        System.out.println("color my horse is "+ color);
        
    }
    public void type() {
        System.out.println("type my horse is "+ typeofhorse );
        
    }
    public void afterrace() {
        System.out.println(this.getName() +" she need Water ");
        
    }

}
