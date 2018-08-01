package com.learning.java.basics.model;

public class TataCar extends AbstractCar {

    public TataCar() {
    }

    public TataCar(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return this.factoryName + "|" + this.color + "|" + this.color;
    }
}
