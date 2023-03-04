package singleton;

import dto.User;
import singleton.one.Singleton;
import singleton.two.UsersDBWorker;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.print();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.print();

        UsersDBWorker usersDBWorker = UsersDBWorker.getInstance();
        usersDBWorker.save(new User());
    }
}
