package factory;

public class Motorcycle extends Transport{

    public Motorcycle() {
        super(2, false, true);
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle rides");
    }
}
