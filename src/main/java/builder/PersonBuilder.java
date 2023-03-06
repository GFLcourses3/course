package builder;

public interface PersonBuilder {
    PersonBuilder name(String name);
    PersonBuilder surname(String surname);
    PersonBuilder age(Integer age);
    PersonBuilder height(Double height);
    PersonBuilder weight(Double weight);
    Person build();
}
