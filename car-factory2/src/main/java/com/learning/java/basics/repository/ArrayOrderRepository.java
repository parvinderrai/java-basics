package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

public class ArrayOrderRepository implements OrderRepository {
    private CarOrder[] carOrders = new CarOrder[4];
    //this will be used to assign orderId
    private static int numberOfOrders = 0;


    @Override
    public CarOrder save(CarOrder carOrder) {
        carOrders[numberOfOrders] = carOrder;
        numberOfOrders++;
        return  carOrder;
    }

    @Override
    public CarOrder[] findAll() {
        CarOrder[] currentOrders = new CarOrder[numberOfOrders];

        for(int i=0;i<numberOfOrders;i++)
            currentOrders[i]=carOrders[i];

        return currentOrders;
    }
}
