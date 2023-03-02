package com.geeksforless.dto;

public class PersonDTO {
    private int age;
    private String name;

    public PersonDTO(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
