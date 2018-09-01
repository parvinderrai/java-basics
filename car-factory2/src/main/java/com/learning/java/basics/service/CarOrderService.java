package com.learning.java.basics.service;

import com.learning.java.basics.model.CarOrder;
import com.learning.java.basics.repository.ArrayOrderRepository;
import com.learning.java.basics.repository.FileOrderRepository;
import com.learning.java.basics.repository.OrderRepository;

import java.io.IOException;
import java.text.ParseException;

public class CarOrderService {

    //car order repository
    OrderRepository orderRepository;

    public CarOrderService() {
        String carStorage=System.getProperty("car.storage");

        if(carStorage!=null && carStorage.length()!=0 && carStorage.equalsIgnoreCase("file")) {
            System.out.println("Using file storage.");
            orderRepository=new FileOrderRepository();
        }else {
            System.out.println("Using in-memory storage.");
            orderRepository=new ArrayOrderRepository();
        }
    }

    public void placeOrder(CarOrder carOrder) {
        System.out.printf("Received order: %s%n",carOrder);
        orderRepository.save(carOrder);
    }

    public void displayOrders() {
        System.out.printf("Showing current orders...");
        CarOrder[] carOrders = new CarOrder[0];
        try {
            carOrders = orderRepository.findAll();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for(int i=0; i<carOrders.length;i++)
            System.out.printf("%s%n",carOrders[i]);
    }

    public int getOrderCount() throws IOException, ParseException {
        return orderRepository.findAll().length;
    }

}
