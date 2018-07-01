package com.learning.java.basics.service;

import com.learning.java.basics.model.Car;

public class OrderCarService {

    private Car[] carOrders = new Car[4];
    private static int numberOfOrders = 0;

    public void placeOrder(Car car) {
        System.out.printf("Received order: %s%n",car);
        //TODO - add car to the array
    }

    public void displayOrders() {
        System.out.printf("Showing current orders...");
        for(int i=0; i<carOrders.length;i++)
            System.out.printf("%s%n",carOrders[i]);
    }
}
