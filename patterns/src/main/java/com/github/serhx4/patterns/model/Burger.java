package com.github.serhx4.patterns.model;

public abstract class Burger implements Product{

    String title;
    private String description;
    private double cost;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return makeBurger();
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract String makeBurger();

}
