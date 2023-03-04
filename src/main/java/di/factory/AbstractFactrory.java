package di.factory;

public interface AbstractFactrory {

    <T> T create(Class<T> tClass);
}
