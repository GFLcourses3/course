package wrapper_decorator;

public class Tea implements Drink{
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
