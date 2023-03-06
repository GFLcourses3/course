package factory;

public class Bicycle extends Transport{

    public Bicycle() {
        super(2, true, false);
    }

    @Override
    public void drive() {
        System.out.println("Bicycle rides");
    }
}
