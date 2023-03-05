package patterns.singleton;

import patterns.singleton.model.User;
import patterns.singleton.singleton.UserSingleton;

public class Main {
    public static void main(String[] args) {
        UserSingleton userSingleton = UserSingleton.getInstance();
        User user1 = userSingleton.createUser(1, "Dmytro", "Tatarynov", "st", "dmytro_tatarynov", "qwerty123", System.currentTimeMillis());
        User user2 = userSingleton.createUser(2, "Dmytro2", "Tatarynov2", "st 2", "dmytro_tatarynov2", "qwerty12345", System.currentTimeMillis());

        System.out.println(user1.getId() + " " + user1.getFirstName() + " " + user1.getLastName() + " " + user1.getAddress() + " " + user1.getLogin() + " " + user1.getPassword() + " " + user1.getTimestamp());
        System.out.println(user2.getId() + " " + user2.getFirstName() + " " + user2.getLastName() + " " + user2.getAddress() + " " + user2.getLogin() + " " + user2.getPassword() + " " + user2.getTimestamp());
    }
}
