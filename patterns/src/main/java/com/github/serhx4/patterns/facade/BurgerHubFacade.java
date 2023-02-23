package com.github.serhx4.patterns.facade;

import com.github.serhx4.patterns.factory.BurgerFactory;
import com.github.serhx4.patterns.model.Burger;
import com.github.serhx4.patterns.model.BurgerHubOrder;
import com.github.serhx4.patterns.model.Order;

public class BurgerHubFacade {

    public static Order orderHamburgerMenu(BurgerFactory burgerFactory) {
        Burger hamburger = burgerFactory.createHamburger();
        // create fried potato product
        // create drink
        // other setups
        return new BurgerHubOrder(hamburger); // (hamburger, friedPotato, cola, ...)
    }

    public static Order orderCheeseburgerMenu(BurgerFactory burgerFactory) {
        Burger cheeseburger = burgerFactory.createCheeseburger();
        // ...
        return new BurgerHubOrder(cheeseburger);
    }
}
