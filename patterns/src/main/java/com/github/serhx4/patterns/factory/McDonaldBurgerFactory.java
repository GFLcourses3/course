package com.github.serhx4.patterns.factory;

import com.github.serhx4.patterns.builder.McDonaldBurgerBuilder;
import com.github.serhx4.patterns.model.Burger;
import com.github.serhx4.patterns.model.StandardBurger;

public class McDonaldBurgerFactory implements BurgerFactory {

    @Override
    public Burger createHamburger() {
        return new McDonaldBurgerBuilder(new StandardBurger())
                .withTitle("Mc Hamburger")
                .withBun()
                .withPatty()
                .withSauce()
                .withVegetables()
                .build();
    }

    @Override
    public Burger createCheeseburger() {
        return new McDonaldBurgerBuilder(new StandardBurger())
                .withTitle("Mc Cheeseburger")
                .withBun()
                .withPatty()
                .withSauce()
                .withVegetables()
                .withCheese()
                .build();
    }

    @Override
    public Burger createWhooper() {
        return new McDonaldBurgerBuilder(new StandardBurger())
                .withTitle("Big Tasty")
                .withBun()
                .withPatty()
                .withPatty()
                .withSauce()
                .withVegetables()
                .withCheese()
                .build();
    }
}
