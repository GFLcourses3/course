package factory;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer(new ElectricFactory());
        customer.buyBike();
        customer.buyCar();

        Customer customer1 = new Customer(new GasFactory());
        customer1.buyBike();
        customer1.buyCar();
    }
}
