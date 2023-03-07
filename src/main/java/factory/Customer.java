package factory;

public class Customer {
    private AbstractFactory factory;

    public Customer(AbstractFactory factory) {
        this.factory = factory;
    }

    public void buyBike(){
        Bike bike = factory.createBike();
        bike.buy();
    }
    public void buyCar(){
        Car car = factory.createCar();
        car.buy();

    }
}
