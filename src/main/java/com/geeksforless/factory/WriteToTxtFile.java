package com.geeksforless.factory;

public class WriteToTxtFile implements Write {
    @Override
    public void write(String path) {
        System.out.println("Write to txt file " + path);
    }
}