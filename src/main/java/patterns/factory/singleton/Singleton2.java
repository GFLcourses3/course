package patterns.factory.singleton;

import patterns.factory.Singleton;

public class Singleton2 implements Singleton {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return instance;
    }

    // реализация методов интерфейса
}