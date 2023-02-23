package com.github.serhx4.patterns.model.mapper;

import com.github.serhx4.patterns.dto.ProductDto;
import com.github.serhx4.patterns.model.Product;

public class ProductDtoMapper<F, T> implements Mapper<Product, ProductDto> {

    @Override
    public ProductDto map(Product from) {
        return new ProductDto(
                from.getTitle(),
                from.getDescription(),
                from.getCost()
        );
    }
}
