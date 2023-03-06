package publisher_subscriber;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Publisher{

    private List<Subscriber> subscribers;
    String itemName;
    Double itemPrice;
    String itemCompany;

    public Shop() {
        subscribers = new ArrayList<>();
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public void addItem(String itemName, Double itemPrice, String itemCompany) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCompany = itemCompany;
        notifySubscribers();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers)
        {
            subscriber.update(itemName, itemPrice, itemCompany);
        }
    }
}
