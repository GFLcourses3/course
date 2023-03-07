package factory;

public class ElectricBike extends Bike {
    @Override
    public void buy() {
        System.out.println("You bought an electric bike");
    }
}
