package builder;

public class RunApplication {
    public static void main(String[] args) {
        Person person_1 = new PersonBuilderImpl().name("Maks").age(21).build();
        System.out.println(person_1);

        Person person_2 = new PersonBuilderImpl().name("Ivan").surname("Ivanov").age(21).height(180.0).weight(80.5).build();
        System.out.println(person_2);
    }
}
