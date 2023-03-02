package com.geeksforless.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStorage {
    private List<Person> people;

    public PeopleStorage() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void deletePerson(Person person) {
        people.remove(person);
    }

    public List<PersonDTO> getAllPeople() {
        return people.stream().map(person -> new PersonDTO(person.getAge(), person.getName())).collect(Collectors.toList());
    }
}
