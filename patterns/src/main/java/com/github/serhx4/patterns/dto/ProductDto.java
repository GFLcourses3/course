package com.github.serhx4.patterns.dto;

import java.util.Objects;

public class ProductDto {

    private final String title;
    private final String description;
    private final double cost;

    public ProductDto(String title, String description, double cost) {
        this.title = title;
        this.description = description;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return Double.compare(that.cost, cost) == 0 && Objects.equals(title, that.title) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, cost);
    }
}
