package com.group2;
import java.util.ArrayList;
public class Myhouse extends location implements Liveable {

        public Myhouse(String country, int size, ArrayList<Integer> population) {
         super(country, size, population);
        }
    
        @Override
        public void earthquake() {
            System.out.println(this.getCountry() + ": Have massive earthquake!");
        }
    
        @Override
        public void wind() {
            System.out.println(this.getCountry() + ": Have windy weather!");
        }
    
        @Override
        public void rain() {
            System.out.println(this.getCountry() + ": Have a rainy weather!");
        }
    
    }

