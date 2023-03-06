package wrapper_decorator;

public class Lemon extends DrinkDecorator{
    public Lemon(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with lemon";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.5;
    }
}
