package com.github.serhx4.patterns.publisher.message;

import java.util.Arrays;

public class JsonMessage implements Message {

    private static final String JSON_FORMAT = "{data : %s}";

    private final String jsonMessage;

    public JsonMessage(String...message) {
        this.jsonMessage = toJson(message);
    }

    @Override
    public String getMessage() {
        return jsonMessage;
    }

    private String toJson(String[] messages) {
        return String.format(JSON_FORMAT, Arrays.toString(messages));
    }
}
