package patterns.facade.singleton;

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
        // приватный конструктор
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void action1() {
        System.out.println("Singleton1 Action 1");
    }

    public void action2() {
        System.out.println("Singleton1 Action 2");
    }
}