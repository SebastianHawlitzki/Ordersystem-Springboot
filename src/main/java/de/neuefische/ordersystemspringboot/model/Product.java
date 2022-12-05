package de.neuefische.ordersystemspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    //Attribute

    private int productID;

    private String productName;

}