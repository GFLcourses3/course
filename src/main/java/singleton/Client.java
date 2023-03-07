package singleton;


public class Client {
    public static void main( String[] args ){
        Singleton singletonOne = Singleton.getInstance("Singleton One");
        Singleton singletonNext = Singleton.getInstance("Singleton Next");
        System.out.println(singletonOne);
        System.out.println(singletonNext);
   }}
