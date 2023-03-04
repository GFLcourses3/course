package factory;

import factory.fruits.Banana;
import factory.fruits.Fruit;
import factory.fruits.Fruits;
import factory.fruits.Peach;
import factory.vegetables.Onion;
import factory.vegetables.Potato;
import factory.vegetables.Vegetable;
import factory.vegetables.Vegetables;

public class ProductFactory{

    public Fruit createFruite(Fruits fruits) throws Exception {

        if (fruits == Fruits.BANANA) {
            return new Banana();
        } else if (fruits == Fruits.PEACH) {
            return new Peach();
        } else {
            throw  new Exception("Fruit not found");
        }
    }

    public Vegetable createVegetable(Vegetables vegetables) throws Exception {

        if (vegetables == Vegetables.ONION) {
            return new Onion();
        } else if (vegetables == Vegetables.POTATO) {
            return new Potato();
        } else {
            throw  new Exception("Vegetable not found");
        }
    }
}
