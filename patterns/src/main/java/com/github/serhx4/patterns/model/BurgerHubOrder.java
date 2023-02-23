package com.github.serhx4.patterns.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BurgerHubOrder implements Order {

    private final List<Product> products = new ArrayList<>();

    public BurgerHubOrder() {
    }

    public BurgerHubOrder(Product...productArr) {
        Arrays.stream(productArr).forEach(this::addProduct);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public double getTotal() {
        return products.stream()
                .mapToDouble(Product::getCost)
                .sum();
    }

    @Override
    public String toString() {
        return "BurgerHubOrder{" +
                "products=" + products + ", " +
                "total=" + getTotal() +
                '}';
    }
}
