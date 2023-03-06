package di.factory;

public interface AbstractFactory {
    <T> T create(Class<T> classT);
}