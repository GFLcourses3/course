package com.github.serhx4.patterns;

import com.github.serhx4.patterns.di.ApplicationContext;
import com.github.serhx4.patterns.facade.BurgerHubFacade;
import com.github.serhx4.patterns.factory.KentuckyBurgerFactory;
import com.github.serhx4.patterns.factory.McDonaldBurgerFactory;
import com.github.serhx4.patterns.model.Order;

public class ApplicationRunner {

    public static void main(String[] args) {

        ApplicationContext context = ApplicationContext.getContext();

        McDonaldBurgerFactory mcDonaldFactory = context.create(McDonaldBurgerFactory.class);
        KentuckyBurgerFactory kentuckyFactory = context.create(KentuckyBurgerFactory.class);

        Order hamburgerMenuOrder = BurgerHubFacade.orderHamburgerMenu(mcDonaldFactory);
        Order cheeseburgerMenuOrder = BurgerHubFacade.orderCheeseburgerMenu(kentuckyFactory);

        System.out.println(hamburgerMenuOrder);
        System.out.println(cheeseburgerMenuOrder);

    }

}
