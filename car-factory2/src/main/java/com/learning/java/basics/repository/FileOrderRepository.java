package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

import java.io.File;

public class FileOrderRepository implements OrderRepository {
    //this will be used to assign orderId
    private static int numberOfOrders = 0;

    private File ordersFile = null;

    @Override
    public CarOrder save(CarOrder carOrder) {
        System.out.printf("Using File Repository.....");

        //TODO assign orderId value

        //TODO write order to file (ordersFile)

        //TODO return order
        return null;
    }

    @Override
    public CarOrder[] findAll() {
        //TODO read all orders from file

        //TODO load all orders from file into array and return it

        return new CarOrder[0];
    }
}
