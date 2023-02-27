package com.github.serhx4.patterns.proxy;

import com.github.serhx4.patterns.model.Guest;
import com.github.serhx4.patterns.model.Product;
import com.github.serhx4.patterns.model.User;

import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;

import static com.github.serhx4.patterns.model.User.Role.ADMIN;

public class ProductRepositoryProxy implements ProductRepository {

    private static final User DUMMY_USER = new Guest();

    private final ProductRepository productRepository;
    private final Map<Integer, Product> productCache;


    public ProductRepositoryProxy(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
        productCache = new WeakHashMap<>();
    }

    @Override
    public Product getById(Integer id) {
        Product product = productCache.get(id);
        if (product != null) {
            return product;
        } else return getFromServerById(id);
    }

    @Override
    public boolean deleteById(Integer id) {
        User currentUser = getUserFromContext();
        if (currentUser.getRole().equals(ADMIN)) {
            return productRepository.deleteById(id);
        } else {
            throw new RuntimeException("You have no rights to perform this action");
        }
    }

    private Product getFromServerById(Integer id) {
        return Optional.ofNullable(productRepository.getById(id))
                .map(product -> {
                    productCache.put(id, product);
                    return product;
                })
                .orElseThrow(RuntimeException::new);
    }

    private User getUserFromContext() {
        return DUMMY_USER;
    }
}
