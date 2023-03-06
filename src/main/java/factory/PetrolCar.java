package factory;

public class PetrolCar extends Transport {
    public PetrolCar() {
        super(4, false, true);
    }

    @Override
    public void drive() {
        System.out.println("Petrol car rides");
    }
}
