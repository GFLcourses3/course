package com.github.serhx4.patterns.decorator;

import com.github.serhx4.patterns.model.Burger;

public class Pickles extends BurgerWrapper {

    private static final String PICKLES = " Crispy pickles,";

    public Pickles(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return makeBurger();
    }

    @Override
    public double getCost() {
        return burger.getCost() + 0.1;
    }

    @Override
    public String makeBurger() {
        return burger.getDescription() + PICKLES;
    }
}
