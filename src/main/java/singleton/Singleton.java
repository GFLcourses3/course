package singleton;

import java.util.Objects;

public final class Singleton {
    private static Singleton instance;
    private String name;

    private Singleton(String name){
        this.name = name;
    }
    public static Singleton getInstance(String name){
        if (instance==null){
            instance = new Singleton(name);}
            return  instance;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton singleton = (Singleton) o;
        return Objects.equals(name, singleton.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
