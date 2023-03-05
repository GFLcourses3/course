package patterns.facade.singleton;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
        // приватный конструктор
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void action1() {
        System.out.println("Singleton2 Action 1");
    }

    public void action2() {
        System.out.println("Singleton2 Action 2");
    }
}