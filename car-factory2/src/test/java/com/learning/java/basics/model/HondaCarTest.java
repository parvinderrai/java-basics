package com.learning.java.basics.model;

import org.junit.Assert;
import org.junit.Test;

public class HondaCarTest {

    @Test
    public void hondaCarIsMadeInLudhiana() {
        HondaCar car1 = new HondaCar();
        //verify that car factory name is Ludhiana
        Assert.assertEquals("Car factory name is expected to be Ludhiana.","Ludhiana",car1.factoryName);
    }

    @Test
    public void givenCarNameAndColorFactoryIsAssigned(){
        HondaCar car1 = new HondaCar("Honda Accord","Red");
        Assert.assertEquals("Car name should be 'Honda Accord'","Honda Accord", car1.getName());
        Assert.assertEquals("Car Color should be 'Red'","Red", car1.getColor());
        Assert.assertTrue("Ludhiana".equals(car1.getFactoryName()));
    }
}
