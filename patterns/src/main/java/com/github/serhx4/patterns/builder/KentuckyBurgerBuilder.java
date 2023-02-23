package com.github.serhx4.patterns.builder;

import com.github.serhx4.patterns.decorator.*;
import com.github.serhx4.patterns.model.Burger;

public class KentuckyBurgerBuilder implements BurgerBuilder {

    private Burger burger;

    public KentuckyBurgerBuilder(Burger burger) {
        this.burger = burger;
    }

    @Override
    public BurgerBuilder withTitle(String title) {
        burger.setTitle(title);
        return this;
    }

    @Override
    public BurgerBuilder withBun() {
        this.burger = new SeedBun(burger);
        return this;
    }

    @Override
    public BurgerBuilder withPatty() {
        this.burger = new ChickenPatty(burger);
        return this;
    }

    @Override
    public BurgerBuilder withSauce() {
        this.burger = new Mayonnaise(burger);
        return this;
    }

    @Override
    public BurgerBuilder withVegetables() {
        this.burger = new Lettuce(burger);
        return this;
    }

    @Override
    public BurgerBuilder withCheese() {
        this.burger = new Cheddar(burger);
        return this;
    }

    @Override
    public Burger build() {
        return burger;
    }
}
