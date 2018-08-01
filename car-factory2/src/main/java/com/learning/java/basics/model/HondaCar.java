package com.learning.java.basics.model;

public class HondaCar extends AbstractCar {

    final String factoryName = "Ludhiana";

    public HondaCar() {
    }

    public HondaCar(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return this.factoryName + "|"+ this.name + "|" + this.color;
    }
}
