package com.learning.java.basics.service;

import com.learning.java.basics.model.CarOrder;
import com.learning.java.basics.model.HondaCar;
import com.learning.java.basics.repository.ArrayOrderRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class CarOrderServiceTest {

    /**
     * Test driven development.
     *
     *  1 - you write a test first
     *  2 - your test will always fail
     *  3 - then you fix your code
     *  4 - rerun test again
     *  5 - repeat 1-4 until test passes
     */

    @Ignore  // this test will not be executed.
    @Test
    public void whenNoOrderIsPlacedOrderCountIsZero() throws IOException, ParseException {
        CarOrderService service = new CarOrderService();
        int orderCount = service.getOrderCount();
        Assert.assertEquals("Expected order count = 0.",0,orderCount);
    }

    @Test
    public void whenOneOrderIsPlacedOrderCountIsOne() throws IOException, ParseException {
        CarOrderService service = new CarOrderService();
        //verify order count before placing the order
        int orderCount = service.getOrderCount();
        Assert.assertEquals("Expected order count = 0.",0,orderCount);

        //place order
        service.placeOrder(new CarOrder(new HondaCar("Honda Accord","Blue")));

        //verify count again
        orderCount = service.getOrderCount();
        //Assert.assertTrue("Expected order count = 1.",orderCount==1);
        Assert.assertEquals("Expected order count = 1.",1,orderCount);

    }

    @Test
    public void whenTwoOrdersArePlacedOrderCountIsTwo(){
        Assert.fail("This test is not implemented, yet!");

    }

    @Test
    public void whenNotSpecifiedInMemoryStorageIsUsed() {
        CarOrderService service = new CarOrderService();
        Assert.assertTrue("Expected In memory storage to be used.",service.orderRepository instanceof ArrayOrderRepository);
    }

    @Test
    public void whenFileStorageSpecifiedInMemoryStorageIsNotUsed() {
        System.setProperty("car.storage","file");
        CarOrderService service = new CarOrderService();
        Assert.assertFalse("Expected In memory storage NOT to be used.",service.orderRepository instanceof ArrayOrderRepository);
    }

}
