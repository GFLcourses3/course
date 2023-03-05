package patterns.facade;

import patterns.facade.facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doActions();
    }
}
