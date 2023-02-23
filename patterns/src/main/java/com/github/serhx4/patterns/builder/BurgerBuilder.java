package com.github.serhx4.patterns.builder;

import com.github.serhx4.patterns.model.Burger;

public interface BurgerBuilder {

    BurgerBuilder withTitle(String title);

    BurgerBuilder withBun();

    BurgerBuilder withPatty();

    BurgerBuilder withSauce();

    BurgerBuilder withVegetables();

    BurgerBuilder withCheese();

    Burger build();

}
