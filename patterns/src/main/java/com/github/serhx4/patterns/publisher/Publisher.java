package com.github.serhx4.patterns.publisher;

import com.github.serhx4.patterns.publisher.message.Message;

public interface Publisher {

    void publish(Message message);
}
