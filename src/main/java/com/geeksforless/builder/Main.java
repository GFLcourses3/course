package com.geeksforless.builder;

public class Main {
    public static void main(String[] args) {
        Person person = PersonBuilder.builder().name("Andy").build();
        System.out.println(person);
    }
}
