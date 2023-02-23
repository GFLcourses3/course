package com.github.serhx4.patterns.publisher;

import com.github.serhx4.patterns.publisher.message.Message;
import com.github.serhx4.patterns.singleton.BurgerHubServer;

public class BurgerStore implements Publisher {

    private final Topic topic;

    public BurgerStore(Topic topic) {
        this.topic = topic;
    }

    @Override
    public void publish(Message message) {
        BurgerHubServer.getInstance().sendMessage(topic, message);
    }

}
