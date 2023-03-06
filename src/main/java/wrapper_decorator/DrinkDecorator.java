package wrapper_decorator;

public abstract class DrinkDecorator implements Drink{

    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }

    @Override
    public Double getCost() {
        return drink.getCost();
    }
}
