package builder;

public class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();
    @Override
    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder surname(String surname) {
        person.setSurname(surname);
        return this;
    }

    @Override
    public PersonBuilder age(Integer age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder height(Double height) {
        person.setHeight(height);
        return this;
    }

    @Override
    public PersonBuilder weight(Double weight) {
        person.setWeight(weight);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
