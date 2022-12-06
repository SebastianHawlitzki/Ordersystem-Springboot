package de.neuefische.ordersystemspringboot.controller;

import de.neuefische.ordersystemspringboot.model.Order;
import de.neuefische.ordersystemspringboot.model.Product;
import de.neuefische.ordersystemspringboot.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/shop")

public class ShopController {

    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }


    // getProduct(){
    @GetMapping("product/{productKey}")
    public Product getProduct(@PathVariable int productKey) {
        return  service.getProduct(productKey);
    }

    //getProductList
    @GetMapping("/product")
    public Map<Integer, Product> listOfAllProducts() {
        return service.listOfAllProducts();

    }

    //addOrder(){
    @PostMapping
    public Order add(@RequestBody Order order){
        return service.add(order);
    }


    //getOrder(){
    @GetMapping("order")
    public Order getOrder(int orderKey){
        return service.getOrder(orderKey);
    }


    //getOrderList
    @GetMapping
    public Map<Integer, Order> listOfAllOrders(){
        return service.listOfAllOrders();

    }

}
