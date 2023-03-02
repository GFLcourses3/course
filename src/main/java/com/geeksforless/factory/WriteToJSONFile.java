package com.geeksforless.factory;

public class WriteToJSONFile implements Write {
    @Override
    public void write(String path) {
        System.out.println("Write to json file " + path);
    }
}