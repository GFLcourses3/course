package factory;

public class GasFactory implements AbstractFactory{
    @Override
    public Bike createBike() {
        return new GasBike();
    }
    @Override
    public Car createCar() {
        return new GasCar();
    }
}
