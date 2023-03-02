package com.geeksforless.builder;

public class PersonBuilder {
    private String name;
    private int age;

    public PersonBuilder name(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age){
        this.age = age;
        return this;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public Person build(){
        return new Person(name, age);
    }
}
