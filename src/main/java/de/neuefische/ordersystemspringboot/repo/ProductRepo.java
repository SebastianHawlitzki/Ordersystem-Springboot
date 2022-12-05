package de.neuefische.ordersystemspringboot.repo;


import de.neuefische.ordersystemspringboot.model.Product;
import lombok.Data;
import java.util.Map;
@Data

public class ProductRepo  {

    //List()

    private Map<Integer, Product> products = Map.of(
            1, new Product(1, "Product1"),
            2, new Product(2, "Product2"),
            3, new Product(3, "Product3"),
            4, new Product(4, "Product4")
    );

    //Get Product
    public Product getProduct(int productKey) {
        return products.get(productKey);



    }

}

