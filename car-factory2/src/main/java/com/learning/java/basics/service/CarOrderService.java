package com.learning.java.basics.service;

import com.learning.java.basics.model.Car;
import com.learning.java.basics.model.CarOrder;
import com.learning.java.basics.repository.ArrayOrderRepository;
import com.learning.java.basics.repository.FileOrderRepository;
import com.learning.java.basics.repository.OrderRepository;

public class CarOrderService {

    //car order repository
    OrderRepository orderRepository;

    public CarOrderService() {
        String carStorage=System.getProperty("car.storage");

        if(carStorage!=null || carStorage.length()!=0 || carStorage.equalsIgnoreCase("file")) {
            orderRepository=new FileOrderRepository();
        }else {
            orderRepository=new ArrayOrderRepository();
        }
    }

    public void placeOrder(CarOrder carOrder) {
        System.out.printf("Received order: %s%n",carOrder);
        orderRepository.save(carOrder);
    }

    public void displayOrders() {
        System.out.printf("Showing current orders...");
        CarOrder[] carOrders = orderRepository.findAll();
        for(int i=0; i<carOrders.length;i++)
            System.out.printf("%s%n",carOrders[i]);
    }
}
