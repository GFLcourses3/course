package com.github.serhx4.patterns.model;

import java.util.List;

public interface Order {

    List<Product> getProducts();

    void addProduct(Product product);

    double getTotal();
}
