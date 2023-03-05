package patterns.proxy.proxy;

import patterns.proxy.MyInterface;

public class MyImplementation implements MyInterface {
    @Override
    public void doSomething(String param) {
        System.out.println("Doing something with " + param);
    }
}