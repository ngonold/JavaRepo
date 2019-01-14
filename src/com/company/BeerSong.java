package com.company;

//import com.company.InterPack.Beverage;

import com.company.InterPack.Beverage;

import java.sql.SQLOutput;

public class BeerSong {
    public static void main(String[] args) {
        Beer lager = new Beer();
        lager.setName("Baltika9");
        lager.setName("Yellow");
        lager.setVolume(0.5);
        Beer apa = new Beer();
        System.out.println(apa.getName());
        System.out.println(apa.calcPerc(3, 4));
        System.out.println(lager);

    }

}

class Beer implements Beverage {
    private String name;
    private String color;
    private double volume;
    private float alcohol;

    public void setName(String name) {
        this.name = name;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String getName() {
        return this.name;
    }
    public double getVolume() {
        return this.volume;
    }

    int calcPerc (int aPerc, int bPerc) {
        return aPerc + bPerc;
    }

    @Override
    public void setAlcPerc(float alc) {
        this.alcohol = alc;
    }
}
