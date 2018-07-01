package com.learning.java.basics.model;

import java.util.Date;

public class Car {
    String name;
    String color;
    Date orderDate;
    static String factoryName;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.orderDate = new Date();
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public static String getFactoryName() {
        return factoryName;
    }

    public static void setFactoryName(String factoryName) {
        Car.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
