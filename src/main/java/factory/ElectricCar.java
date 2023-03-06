package factory;

public class ElectricCar extends Transport{
    public ElectricCar() {
        super(4, true, true);
    }

    @Override
    public void drive() {
        System.out.println("Electric car rides");
    }
}
