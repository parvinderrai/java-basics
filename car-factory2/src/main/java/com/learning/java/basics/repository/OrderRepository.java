package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public interface OrderRepository {

    CarOrder save(CarOrder carOrder);

    CarOrder[] findAll() throws IOException, ParseException;
}
