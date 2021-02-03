package com.mashallathon2.group0;

import com.mashallathon2.living.Living;
import com.mashallathon2.organism.Organism;

public class Cat extends Organism implements Living {

    public Cat(String name, int health, int energy) {
        super(name, health, energy);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + ": Meow! 🐈");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + ": Meeeeeove! 🐈‍⬛ 🐈‍⬛ 🐈‍⬛");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + ": Meoowwwzzzzzz 💤 💤 💤");
    }

}
