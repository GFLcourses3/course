package com.github.serhx4.patterns.publisher;

import com.github.serhx4.patterns.publisher.message.Message;
import com.github.serhx4.patterns.singleton.BurgerHubServer;

public class BurgerKitchen implements Subscriber {

    public BurgerKitchen() {
        BurgerHubServer.getInstance().registerSubscriber(this, Topic.ORDER_CREATED);
    }
    @Override
    public void receiveMessage(Topic topic, Message message) {
        // new order received
    }
}
