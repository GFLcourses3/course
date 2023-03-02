package com.geeksforless.factory;

public class Main {
    public static void main(String[] args) {
        Write write = WriteToFileFactory.writeToFile(WriteToFileFactory.FileType.TXT);
        write.write("src/main/resources/");
    }
}