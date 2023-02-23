package com.github.serhx4.patterns.decorator;

import com.github.serhx4.patterns.model.Burger;

public class BeefPatty extends BurgerWrapper {

    private static final String BEEF_PATTY = " Beef patty,";

    public BeefPatty(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return makeBurger();
    }

    @Override
    public double getCost() {
        return burger.getCost() + 0.8;
    }

    @Override
    public String makeBurger() {
        return burger.makeBurger() + BEEF_PATTY;
    }

}
