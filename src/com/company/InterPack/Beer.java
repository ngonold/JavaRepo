package com.company.InterPack;

public class Beer implements Beverage {
    private float alcPerc;
    @Override
    public void setAlcPerc(float alc) {
        this.alcPerc = alcPerc;
    }
    public void printAlcPerc() {
        System.out.println(alcPerc);
    }
    Beer(float alcPerc) {
        setAlcPerc(alcPerc);
    }
}
