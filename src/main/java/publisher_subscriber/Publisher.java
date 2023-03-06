package publisher_subscriber;

public interface Publisher {
    void subscribe(Subscriber o);
    void unsubscribe(Subscriber o);
    void notifySubscribers();
}
