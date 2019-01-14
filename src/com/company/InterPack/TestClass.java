package com.company.InterPack;

import java.util.ArrayList;

public class TestClass {
    public static void main (String args[]) {
        Beverage bottleOne = new Beer(12f);
        Beverage bottleTwo = new Lemonade();
        ArrayList<String> heroList = new ArrayList<String>();
        ((Beer) bottleOne).printAlcPerc();
        ((Lemonade) bottleTwo).setSugarLvl(0f);
        bottleOne.setAlcPerc(9f);
        bottleTwo.setAlcPerc(7f);
        System.out.println(((Lemonade) bottleTwo).getSugarLevel());
        System.out.println();
        //
        SetTest setTest = new SetTest();
        heroList = setTest.getHeroList();
        for (int i = 0; i < heroList.toArray().length; i++)
            System.out.println(heroList.get(i));
        System.out.println("Feel the difference!!!");
    }
}

class SetTest {
    private String[] marvelHeroes = {"Hulk", "Thor", "Ironman", "Spiderman"};
    private String[] antiHeroes = {"Loki", "Venom"};
    private ArrayList<String> heroList = new ArrayList<String>();

    public ArrayList<String> getHeroList() {
        for (String idx : marvelHeroes) {
            heroList.add(idx);
        }
        return this.heroList;
        //System.out.println("");
    }
}