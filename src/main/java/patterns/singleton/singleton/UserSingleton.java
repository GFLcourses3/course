package patterns.singleton.singleton;

import patterns.singleton.model.User;

public class UserSingleton {

    private static UserSingleton instance;

    private UserSingleton() {
        // приватный конструктор
    }

    public static synchronized UserSingleton getInstance() {
        if (instance == null) {
            instance = new UserSingleton();
        }
        return instance;
    }

    public User createUser(Integer id, String firstName, String lastName, String address, String login, String password, Long timestamp) {
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);
        user.setLogin(login);
        user.setPassword(password);
        user.setTimestamp(timestamp);
        return user;
    }
}