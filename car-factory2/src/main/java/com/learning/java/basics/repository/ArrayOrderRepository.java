package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

public class ArrayOrderRepository implements OrderRepository {
    private CarOrder[] carOrders = new CarOrder[4];
    //this will be used to assign orderId
    private static int numberOfOrders = 0;


    @Override
    public CarOrder save(CarOrder carOrder) {
        return null;
    }

    @Override
    public CarOrder[] findAll() {
        return new CarOrder[0];
    }
}
