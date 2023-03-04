package factory;

import factory.fruits.Fruit;
import factory.fruits.Fruits;
import factory.vegetables.Vegetable;
import factory.vegetables.Vegetables;

public class Main {

    public static void main(String[] args) throws Exception {

        ProductFactory productFactory = new ProductFactory();

        Vegetable vegetable = productFactory.createVegetable(Vegetables.ONION);
        vegetable.taste();

        Fruit fruit = productFactory.createFruite(Fruits.BANANA);
        fruit.taste();
    }
}
