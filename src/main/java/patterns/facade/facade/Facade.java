package patterns.facade.facade;

import patterns.facade.singleton.Singleton1;
import patterns.facade.singleton.Singleton2;
import patterns.facade.singleton.Singleton3;

public class Facade {

    private Singleton1 singleton1;
    private Singleton2 singleton2;
    private Singleton3 singleton3;

    public Facade() {
        singleton1 = Singleton1.getInstance();
        singleton2 = Singleton2.getInstance();
        singleton3 = Singleton3.getInstance();
    }

    public void doActions() {
        singleton1.action1();
        singleton2.action2();
        singleton3.action1();
        singleton1.action2();
        singleton2.action1();
        singleton3.action2();
    }
}