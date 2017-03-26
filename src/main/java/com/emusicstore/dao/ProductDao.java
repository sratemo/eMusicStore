package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samuelratemo on 3/19/17.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();

        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a fender strat guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        Product product2 = new Product();

        product2.setProductName("Record1");
        product2.setProductCategory("record");
        product2.setProductDescription("This is an awesome mix of the 20th century");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(51);
        product2.setProductManufacturer("EMI");

        Product product3 = new Product();

        product3.setProductName("Speaker 1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is a polk shelf speaker");
        product3.setProductPrice(355);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Polk");


        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;

    }

}
