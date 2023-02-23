package com.github.serhx4.patterns.publisher;

import com.github.serhx4.patterns.publisher.message.Message;

public interface Subscriber {

    void receiveMessage(Topic topic, Message message);
}
