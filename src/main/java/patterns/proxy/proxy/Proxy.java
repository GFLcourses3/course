package patterns.proxy.proxy;

import patterns.proxy.MyInterface;

public class Proxy implements MyInterface {
    private final MyImplementation implementation;

    public Proxy() {
        this.implementation = new MyImplementation();
    }

    @Override
    public void doSomething(String param) {
        System.out.println("Calling doSomething with param: " + param);
        implementation.doSomething(param);
    }
}