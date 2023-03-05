package patterns.factory.factory;

import patterns.factory.Singleton;
import patterns.factory.singleton.Singleton1;
import patterns.factory.singleton.Singleton2;

public class Factory {
    public static Singleton createSingleton(String type) {
        if (type.equals("one")) {
            return Singleton1.getInstance();
        } else if (type.equals("two")) {
            return Singleton2.getInstance();
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}