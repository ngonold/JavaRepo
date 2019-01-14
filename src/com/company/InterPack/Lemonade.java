package com.company.InterPack;

public class Lemonade implements Beverage {
    private float alcPerc;
    private float sugarLevel;
    public float getSugarLevel() {
        return sugarLevel;
    }

    @Override
    public void setAlcPerc(float alcPerc) {
        if (alcPerc > 0) {
            System.out.println("This is Lemonade! No alc!");
        }
        this.alcPerc = 0;
    }
    public void setSugarLvl(float sugarLevel) {
        this.sugarLevel = sugarLevel;
    }
    public void showInfo() {
        System.out.println("Alcohol: " + alcPerc + " sugar: " +sugarLevel);
    }
    Lemonade() {
        alcPerc = 0f;
        sugarLevel = 0f;
    }
}
