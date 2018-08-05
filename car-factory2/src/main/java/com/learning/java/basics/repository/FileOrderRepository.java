package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

import java.io.*;
import java.text.ParseException;

public class FileOrderRepository implements OrderRepository {
    //this will be used to assign orderId
    private static int numberOfOrders = 0;

    private File ordersFile = null;

    @Override
    public CarOrder save(CarOrder carOrder) {
        System.out.printf("Using File Repository.....");

        BufferedWriter writer = null;
        try {
            //TODO assign orderId value
            numberOfOrders++;
            carOrder.setOrderId(numberOfOrders);
            //TODO write order to file (ordersFile)
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.home")+"/car-orders.txt",true));
            writer.write(carOrder.toCsv());
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (Exception e) {
            //place order failed hence orderCount is 1 less
            numberOfOrders--;
        }
        //TODO return order
        System.out.printf("Saved order to file: %s",carOrder.toCsv());
        return carOrder;
    }

    @Override
    public CarOrder[] findAll() throws IOException, ParseException {
        //TODO read all orders from file
        BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.home")+"/car-orders.txt"));
        String line = reader.readLine();
        int ctr=0;
        CarOrder[] carOrders = new CarOrder[10]; //TODO array should grow if there are more lines
        while (line!=null){
            carOrders[ctr] = CarOrder.fromCsv(line);
            ctr++;
            line=reader.readLine();
        }
        //TODO load all orders from file into array and return it

        return carOrders;
    }
}
