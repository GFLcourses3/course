package patterns.proxy;

import patterns.proxy.proxy.Proxy;

public class Main {
    public static void main(String[] args) {
        MyInterface proxy = new Proxy();
        proxy.doSomething("test");
    }
}
