package com.github.serhx4.patterns.decorator;

import com.github.serhx4.patterns.model.Burger;

public class Cheddar extends BurgerWrapper {

    private static final String CHEDDAR_CHEESE = " Cheddar cheese,";
    private static final double CHEDDAR_PRICE = 0.2;

    public Cheddar(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return makeBurger();
    }

    @Override
    public double getCost() {
        return burger.getCost() + CHEDDAR_PRICE;
    }

    @Override
    public String makeBurger() {
        return burger.getDescription() + CHEDDAR_CHEESE;
    }
}
