package com.learning.java.basics.model;

import java.util.Date;

public class CarOrder {

    //Order Id will be assigned value by the Order Service
    private int orderId;

    //Date will be the date order is placed.
    private Date orderDate;

    private AbstractCar car;

    public CarOrder(AbstractCar car) {
        this.car = car;
        this.orderDate = new Date();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public AbstractCar getCar() {
        return car;
    }

    public void setCar(AbstractCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return this.orderDate + "|" + this.orderId + "|" + this.car ;
    }
}
