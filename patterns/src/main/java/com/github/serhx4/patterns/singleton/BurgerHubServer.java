package com.github.serhx4.patterns.singleton;

import com.github.serhx4.patterns.publisher.Subscriber;
import com.github.serhx4.patterns.publisher.Topic;
import com.github.serhx4.patterns.publisher.message.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerHubServer implements ContentServer {

    private Map<Topic, List<Subscriber>> subscribers;
    private static BurgerHubServer serverInstance;

    private BurgerHubServer() {
        this.subscribers = new HashMap<>();
    }

    public static BurgerHubServer getInstance() {
        if (serverInstance == null) {
            serverInstance = new BurgerHubServer();
        }
        return serverInstance;
    }

    @Override
    public void sendMessage(Topic topic, Message message) {
        subscribers.get(topic)
                .forEach(subscriber -> subscriber.receiveMessage(topic, message));
    }

    @Override
    public void registerSubscriber(Subscriber subscriber, Topic topic) {
        subscribers.get(topic).add(subscriber);
    }
}
