package com.learning.java.basics.model;

import java.util.Date;

public abstract class AbstractCar {
    String name;
    String color;
    final String factoryName = null;

    public AbstractCar() {
    }

    public AbstractCar(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public static void setFactoryName(String factoryName) {
        Car.factoryName = factoryName;
    }

    @Override
    abstract public String toString();
}
