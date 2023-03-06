package factory;

public class RunApplication {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport electricCar = factory.createTransport("electric car");
        System.out.println(electricCar);
        electricCar.drive();

        Transport petrolCar = factory.createTransport("petrol car");
        System.out.println(petrolCar);
        petrolCar.drive();
    }
}
