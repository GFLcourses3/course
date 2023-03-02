package com.geeksforless.factory;

public class WriteToFileFactory {
    enum FileType {TXT, JSON}

    public static Write writeToFile(FileType fileType) {
        Write write;
        switch (fileType) {
            case TXT:
                write = new WriteToTxtFile();
                break;
            case JSON:
                write = new WriteToJSONFile();
                break;
            default:
                throw new IllegalArgumentException("Incorrect type");
        }
        return write;
    }

}