package com.github.serhx4.patterns.decorator;

import com.github.serhx4.patterns.model.Burger;

public abstract class BurgerWrapper extends Burger {

    Burger burger;

    public BurgerWrapper(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getTitle() {
        return burger.getTitle();
    }
}
