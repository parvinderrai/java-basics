package com.learning.java.basics.model;

public class TataCar extends AbstractCar {

    final String factoryName = "Ludhiana";

    public TataCar() {
    }

    public TataCar(String name, String color) {
        super(name, color);
    }

    @Override
    public String getFactoryName() {
        return factoryName;
    }

    @Override
    public String toString() {
        return this.factoryName + "|" + this.color + "|" + this.color;
    }
}
