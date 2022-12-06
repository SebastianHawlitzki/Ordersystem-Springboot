package de.neuefische.ordersystemspringboot.service;

import de.neuefische.ordersystemspringboot.model.Order;
import de.neuefische.ordersystemspringboot.model.Product;
import de.neuefische.ordersystemspringboot.repo.OrderRepo;
import de.neuefische.ordersystemspringboot.repo.ProductRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
@RequiredArgsConstructor
@Data

public class ShopService  {
//Attribute

    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;


    // getProduct(){
    public Product getProduct(int productKey) {
        return  productRepo.getProduct(productKey);
    }

    //getProductList
    public Map<Integer, Product> listOfAllProducts() {
        return this.productRepo.getProducts();

    }

    //addOrder(){
    public Order add(Order order){
        return orderRepo.add(order);
    }


    //getOrder(){
    public Order getOrder(int orderKey){
        return orderRepo.getOrder(orderKey);
    }


    //getOrderList
    public Map<Integer, Order> listOfAllOrders(){
        return this.orderRepo.getOrders();

    }


}
