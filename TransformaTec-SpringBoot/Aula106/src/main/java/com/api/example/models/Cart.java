package com.api.example.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    
    private List<Product> items = new ArrayList<Product>();

    public void insertProduct(Product product) {

        items.add(product);

    }

    public void removeProduct(Product product) {

        items.remove(product);

    }

    public List<Product> getProducts() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

}
