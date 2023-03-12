package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance("John");
        Singleton secondSingleton = Singleton.getInstance("David");
        System.out.println("first -> " + firstSingleton.name);
        System.out.println("second -> " + secondSingleton.name);
    }
}
