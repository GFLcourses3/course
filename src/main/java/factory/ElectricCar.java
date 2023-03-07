package factory;

public class ElectricCar extends Car {
    @Override
    public void buy() {
        System.out.println("You bought an electric car");
    }
}
