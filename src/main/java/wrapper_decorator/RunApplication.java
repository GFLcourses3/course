package wrapper_decorator;

public class RunApplication {
    public static void main(String[] args) {
        Drink drink_1 = new Tea();
        drink_1 = new Sugar(drink_1);
        drink_1 = new Milk(drink_1);

        System.out.println("Your order: " + drink_1.getDescription());
        System.out.println("Total: " + drink_1.getCost());

        Drink drink_2 = new Tea();
        drink_2 = new Sugar(drink_2);
        drink_2 = new Lemon(drink_2);

        System.out.println("Your order: " + drink_2.getDescription());
        System.out.println("Total: " + drink_2.getCost());
    }
}
