package com.learning.java.basics.repository;

import com.learning.java.basics.model.CarOrder;

<<<<<<< c5a87d23e34a52e63c7273ffe33a625d892bd897
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

=======
>>>>>>> added version 2
public interface OrderRepository {

    CarOrder save(CarOrder carOrder);

<<<<<<< c5a87d23e34a52e63c7273ffe33a625d892bd897
    CarOrder[] findAll() throws IOException, ParseException;
=======
    CarOrder[] findAll();
>>>>>>> added version 2
}
