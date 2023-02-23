package com.github.serhx4.patterns.factory;

import com.github.serhx4.patterns.builder.KentuckyBurgerBuilder;
import com.github.serhx4.patterns.di.AbstractContext;
import com.github.serhx4.patterns.model.Burger;

public class KentuckyBurgerFactory implements BurgerFactory {

    private final AbstractContext context;

    public KentuckyBurgerFactory(AbstractContext context) {
        this.context = context;
    }

    @Override
    public Burger createHamburger() {
        return context.create(KentuckyBurgerBuilder.class)
                .withTitle("Kentucky Chicken Burger")
                .withBun()
                .withPatty()
                .withSauce()
                .withVegetables()
                .build();
    }

    @Override
    public Burger createCheeseburger() {
        return context.create(KentuckyBurgerBuilder.class)
                .withTitle("Kentucky Chicken Cheeseburger")
                .withBun()
                .withPatty()
                .withSauce()
                .withVegetables()
                .withCheese()
                .build();
    }

    @Override
    public Burger createWhooper() {
        return context.create(KentuckyBurgerBuilder.class)
                .withTitle("Kentucky Double Chicken")
                .withBun()
                .withPatty()
                .withPatty()
                .withSauce()
                .withVegetables()
                .withCheese()
                .build();
    }
}
