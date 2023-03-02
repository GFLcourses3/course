package com.github.serhx4.patterns.di;

import com.github.serhx4.patterns.builder.KentuckyBurgerBuilder;
import com.github.serhx4.patterns.builder.McDonaldBurgerBuilder;
import com.github.serhx4.patterns.factory.KentuckyBurgerFactory;
import com.github.serhx4.patterns.factory.McDonaldBurgerFactory;
import com.github.serhx4.patterns.model.Burger;
import com.github.serhx4.patterns.model.Guest;
import com.github.serhx4.patterns.model.StandardBurger;
import com.github.serhx4.patterns.model.User;
import com.github.serhx4.patterns.proxy.ProductRepository;
import com.github.serhx4.patterns.proxy.ProductRepositoryImpl;
import com.github.serhx4.patterns.proxy.ProductRepositoryProxy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ApplicationContext implements AbstractContext {

    private final Map<Class, Object> iocContainer;
    private static ApplicationContext context;

    private ApplicationContext() {
        iocContainer = new HashMap<>();
    }

    public static ApplicationContext getContext() {
        if (context == null) {
            context = new ApplicationContext();
        }
        return context;
    }

    @Override
    public <T> T create(Class<T> tClass) {
        // singletons
        if (KentuckyBurgerFactory.class.isAssignableFrom(tClass)) {
            return createBean(tClass, () -> (T) new KentuckyBurgerFactory(this));
        }
        if (McDonaldBurgerFactory.class.isAssignableFrom(tClass)) {
            return createBean(tClass, () -> (T) new McDonaldBurgerFactory());
        }
        if (User.class.isAssignableFrom(tClass)) {
            return createBean(tClass, () -> (T) new Guest());
        }
        // proxy
        if (ProductRepository.class.isAssignableFrom(tClass)) {
            return createBean(tClass, () -> (T) new ProductRepositoryProxy(new ProductRepositoryImpl()));
        }

        // prototypes
        if (KentuckyBurgerBuilder.class.isAssignableFrom(tClass)) {
            return (T) new KentuckyBurgerBuilder(createBurger());
        }
        if (McDonaldBurgerBuilder.class.isAssignableFrom(tClass)) {
            return (T) new McDonaldBurgerBuilder(createBurger());
        }

        throw new IllegalArgumentException(String.format("No such class related to context is present: %s", tClass));
    }

    private <T> T createBean(Class<T> tClass, Supplier<T> supplier) {
        Object object = iocContainer.get(tClass);
        if (object == null) {
            T bean = supplier.get();
            iocContainer.put(tClass, bean);
            return bean;
        }
        return (T) object;
    }

    private Burger createBurger() {
        return new StandardBurger();
    }

}
