package factory;

public class TransportFactory {
    public Transport createTransport(String type) {
        switch (type) {
            case "electric car":
                return new ElectricCar();
            case "petrol car":
                return new PetrolCar();
            case "bicycle":
                return new Bicycle();
            case "motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Invalid transport type: " + type);
        }
    }
}
