package de.neuefische.ordersystemspringboot.repo;


import de.neuefische.ordersystemspringboot.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class OrderRepo {

    //List
    private Map<Integer, Order> orders = new HashMap<>();


    //Get
    public Order getOrder(int orderKey) {
        return orders.get(orderKey);

    }

    //Add
    public Order add(Order order) {
        return orders.put(order.getOrderID(), order);

    }
}

