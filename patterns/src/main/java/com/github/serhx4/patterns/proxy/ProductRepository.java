package com.github.serhx4.patterns.proxy;

import com.github.serhx4.patterns.model.Product;

public interface ProductRepository {

    Product getById(Integer id);

    boolean deleteById(Integer id);

}
