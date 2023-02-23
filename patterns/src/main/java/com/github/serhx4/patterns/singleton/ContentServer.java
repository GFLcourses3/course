package com.github.serhx4.patterns.singleton;

import com.github.serhx4.patterns.publisher.Subscriber;
import com.github.serhx4.patterns.publisher.message.Message;
import com.github.serhx4.patterns.publisher.Topic;

public interface ContentServer {

    void sendMessage(Topic topic, Message message);

    void registerSubscriber(Subscriber subscriber, Topic topic);
}
