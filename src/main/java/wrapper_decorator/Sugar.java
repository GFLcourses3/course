package wrapper_decorator;

public class Sugar extends DrinkDecorator{
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with sugar";
    }

    @Override
    public Double getCost() {
        return drink.getCost() + 1.0;
    }
}
