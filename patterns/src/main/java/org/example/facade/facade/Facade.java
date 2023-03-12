package org.example.facade.facade;

import org.example.facade.singleton.SingletonFirst;
import org.example.facade.singleton.SingletonSecond;
import org.example.facade.singleton.SingletonThird;

public class Facade {
    private SingletonFirst singletonFirst;
    private SingletonSecond singletonSecond;
    private SingletonThird singletonThird;

    public Facade() {
        singletonFirst = SingletonFirst.getInstance();
        singletonSecond = SingletonSecond.getInstance();
        singletonThird = SingletonThird.getInstance();
    }

    public void someAction(){
        singletonFirst.actionFirst();
        singletonSecond.actionSecond();
        singletonThird.actionFirst();

        singletonFirst.actionSecond();
        singletonSecond.actionFirst();
        singletonThird.actionSecond();
    }
}
