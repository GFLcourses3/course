package singleton.one;

public class Singleton {

    private static Singleton instance;

    private String name;

    private Singleton() {
        name = "GeeksForLess";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {

        System.out.println("Hello, " + name);
    }
}
