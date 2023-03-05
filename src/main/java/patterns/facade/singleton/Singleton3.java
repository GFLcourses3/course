package patterns.facade.singleton;

public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
        // приватный конструктор
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public void action1() {
        System.out.println("Singleton3 Action 1");
    }

    public void action2() {
        System.out.println("Singleton3 Action 2");
    }
}