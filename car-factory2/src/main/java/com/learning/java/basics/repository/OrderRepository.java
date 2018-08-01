package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

public interface OrderRepository {

    CarOrder save(CarOrder carOrder);

    CarOrder[] findAll();
}
