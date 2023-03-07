package factory;

public class GasCar extends Car {
    @Override
    public void buy() {
        System.out.println("You bought a gas car");
    }
}
