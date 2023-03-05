package patterns.factory.singleton;

import patterns.factory.Singleton;

public class Singleton1 implements Singleton {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }

    // реализация методов интерфейса
}