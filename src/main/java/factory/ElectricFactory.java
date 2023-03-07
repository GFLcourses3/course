package factory;

public class ElectricFactory implements AbstractFactory {
    @Override
    public Bike createBike() {
        return new ElectricBike();
    }

    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}
