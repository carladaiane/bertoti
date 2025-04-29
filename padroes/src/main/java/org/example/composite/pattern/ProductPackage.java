package org.example.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class ProductPackage implements Product {
    private String name;
    private List<Product> products = new ArrayList<>();

    public ProductPackage(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}