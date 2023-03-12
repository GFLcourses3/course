package org.example.facade.singleton;

public class SingletonSecond {
    private static SingletonSecond instance;

    private SingletonSecond() {
    }

    public static SingletonSecond getInstance() {
        if(instance == null)
            instance = new SingletonSecond();
        return instance;
    }
    public void actionFirst(){
        System.out.println("Singleton #2 -Action 1");
    }

    public void actionSecond(){
        System.out.println("Singleton #2 -Action 2");
    }
}
