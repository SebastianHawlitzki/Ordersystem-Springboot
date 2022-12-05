package de.neuefische.ordersystemspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    //Attribute

    private int orderID;

    List<Product> products = new ArrayList<>();


}

