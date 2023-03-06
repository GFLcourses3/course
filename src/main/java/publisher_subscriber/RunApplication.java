package publisher_subscriber;

import java.util.ArrayList;
import java.util.List;

public class RunApplication {
    public static void main(String[] args) {
        Shop superPhone = new Shop();

        Client client_1 = new Client("Kirill", "Buyanov", 30);
        Client client_2 = new Client("Anya", "Semenova", 19);
        Client client_3 = new Client("Alla", "Koroleva", 42);

        superPhone.subscribe(client_1);
        superPhone.subscribe(client_2);
        superPhone.subscribe(client_3);

        superPhone.addItem("IPhone 11", 500.0, "Apple");
        superPhone.addItem("Mi A2", 260.0, "Xiaomi");

        superPhone.unsubscribe(client_1);

        superPhone.addItem("Macbook 12 Pro", 850.0, "Apple");
    }
}
