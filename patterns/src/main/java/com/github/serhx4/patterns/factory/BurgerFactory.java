package com.github.serhx4.patterns.factory;

import com.github.serhx4.patterns.model.Burger;

public interface BurgerFactory {

    Burger createHamburger();

    Burger createCheeseburger();

    Burger createWhooper();

}
