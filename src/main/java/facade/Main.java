package facade;

public class Main {

    public static void main(String[] args) throws Exception {

        Facade facade = new Facade();

        facade.doAllJobForUserByLogin("Login");
    }
}
