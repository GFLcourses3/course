package com.github.serhx4.patterns.decorator;

import com.github.serhx4.patterns.model.Burger;

public class Mayonnaise extends BurgerWrapper {

    private static final String MAYONNAISE = " Creamy mayonnaise,";
    private static final double MAYONNAISE_PRICE = 0.2;

    public Mayonnaise(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return makeBurger();
    }

    @Override
    public double getCost() {
        return burger.getCost() + MAYONNAISE_PRICE;
    }

    @Override
    public String makeBurger() {
        return burger.getDescription() + MAYONNAISE;
    }
}
