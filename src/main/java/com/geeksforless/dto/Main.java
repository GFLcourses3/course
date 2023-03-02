package com.geeksforless.dto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PeopleStorage peopleStorage = new PeopleStorage();
        Person person1 = new Person(25, "Jack", LocalDate.of(1998,3,21));
        Person person2 = new Person(21, "Mary", LocalDate.of(2002, 12, 12));
        //print regular person
        System.out.println(person1);
        System.out.println(person2);
        //print dto
        System.out.println("----------------------------------");
        peopleStorage.addPerson(person1);
        peopleStorage.addPerson(person2);
        peopleStorage.getAllPeople().forEach(System.out::println);
    }
}
