package wrapper_decorator;

public class Milk extends DrinkDecorator{
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with milk";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.2;
    }
}
