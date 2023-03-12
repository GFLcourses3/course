package org.example.facade.singleton;

public class SingletonThird {
    private static SingletonThird instance;

    private SingletonThird() {
    }

    public static SingletonThird getInstance() {
        if(instance == null)
            instance = new SingletonThird();
        return instance;
    }
    public void actionFirst(){
        System.out.println("Singleton #3 - Action 1");
    }

    public void actionSecond(){
        System.out.println("Singleton #3 - Action 2");
    }
}
