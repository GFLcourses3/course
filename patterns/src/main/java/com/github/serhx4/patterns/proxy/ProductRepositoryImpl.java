package com.github.serhx4.patterns.proxy;

import com.github.serhx4.patterns.model.Product;
import com.github.serhx4.patterns.model.StandardBurger;

public class ProductRepositoryImpl implements ProductRepository {

    private static final Product DUMMY_PRODUCT = new StandardBurger();

    @Override
    public Product getById(Integer id) {
        getConnection();
        execute(String.format("SELECT * FROM products WHERE id = %s", id));
        return DUMMY_PRODUCT;
    }

    @Override
    public boolean deleteById(Integer id) {
        getConnection();
        execute(String.format("DELETE * FROM products WHERE id = %s", id));
        return true;
    }

    private void getConnection() {
        System.out.println("Creating expensive connection to server/database...");
    }

    private void execute(String sql) {
        System.out.printf("Executing... : %s%n", sql);
    }
}
