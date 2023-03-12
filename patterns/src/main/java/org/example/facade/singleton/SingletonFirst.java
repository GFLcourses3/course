package org.example.facade.singleton;

public class SingletonFirst {
    private static SingletonFirst instance;

    private SingletonFirst() {
    }

    public static SingletonFirst getInstance() {
        if(instance == null)
            instance = new SingletonFirst();
        return instance;
    }

    public void actionFirst(){
        System.out.println("Singleton #1 - Action 1");
    }

    public void actionSecond(){
        System.out.println("Singleton #1 - Action 2");
    }
}
