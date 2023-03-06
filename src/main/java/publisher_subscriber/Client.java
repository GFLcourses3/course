package publisher_subscriber;

public class Client implements Subscriber{

    private String name;
    private String surname;
    private Integer age;

    public Client(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void update(String itemName, Double itemPrice, String itemCompany) {
        System.out.println("Dear " + name + " " + surname + ", in our shop appeared new thing: " + itemName + " for " + itemPrice + "$ from " + itemCompany);
    }
}
