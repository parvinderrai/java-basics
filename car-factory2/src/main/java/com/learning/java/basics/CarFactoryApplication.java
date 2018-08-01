package com.learning.java.basics;

import com.learning.java.basics.model.CarOrder;
import com.learning.java.basics.model.HondaCar;
import com.learning.java.basics.model.TataCar;
import com.learning.java.basics.service.CarOrderService;

import java.util.Scanner;

public class CarFactoryApplication {

    private static CarOrderService orderCarService = new CarOrderService();

    public static void main(String args[]) {

        boolean exitApplication = false;
        do {
            int menuOption = 0;
            System.out.printf(
                    "%n%nWelcome to car factory. %n" +
                     "1. Order Honda Accord%n" +
                    "2. Order Tata Jaguar %n" +
                    "3. Show orders%n" +
                    "4. Quit%n");

            Scanner input = new Scanner(System.in);
            System.out.print("Please make a selection (From Above Menu) :");
            menuOption = input.nextInt();

            switch (menuOption){
                case 1:
                    System.out.printf("%nPlease pick a color for Honda Accord: ");
                    String color = new Scanner(System.in).next();
                    orderCarService.placeOrder(
                            new CarOrder(new HondaCar("Honda Accord", color))
                    );
                    break;
                case 2:
                    System.out.printf("%nPlease pick a color for Tata Jaguar: ");
                    color = new Scanner(System.in).next();
                    orderCarService.placeOrder(
                            new CarOrder(new TataCar("Tata Jaguar", color))
                    );
                    break;
                case 3:
                    System.out.printf("%nWe have received, following orders: %n");
                    orderCarService.displayOrders();
                    break;
                case 4:
                    exitApplication=true;
                    System.out.printf("%nThank you, for using Car Factory. We received following orders today:%n");
                    orderCarService.displayOrders();
                    break;
            }

        }while (!exitApplication);
    }
}
