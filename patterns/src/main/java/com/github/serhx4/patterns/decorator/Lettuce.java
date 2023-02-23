package com.github.serhx4.patterns.decorator;

import com.github.serhx4.patterns.model.Burger;

public class Lettuce extends BurgerWrapper {

    private static final String LETTUCE = " Crisp lettuce,";

    public Lettuce(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return makeBurger();
    }

    @Override
    public double getCost() {
        return burger.getCost() + 0.2;
    }

    @Override
    public String makeBurger() {
        return burger.getDescription() + LETTUCE;
    }
}
