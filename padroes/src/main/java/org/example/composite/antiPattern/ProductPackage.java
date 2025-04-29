package org.example.composite.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class ProductPackage extends Product {
    private List<Product> products;

    public ProductPackage(String name) {
        super(name);
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Product p : products) {
            // 👎 Antipadrão: verifica o tipo com instanceof e trata diferente!
            if (p instanceof SimpleProduct) {
                total += ((SimpleProduct)p).getPrice();
            } else if (p instanceof ProductPackage) {
                total += ((ProductPackage)p).getPrice();
            }
        }
        return total;
    }
}
