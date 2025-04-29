package org.example.composite.pattern;

public class SimpleProduct implements Product {
    private String name;
    private double price;

    public SimpleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}