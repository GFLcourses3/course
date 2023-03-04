package facade;

import di.factory.AbstractFactrory;
import di.factory.DIFactory;
import dto.User;
import singleton.two.UsersDBWorker;

public class Facade {

    private UsersDBWorker usersDBWorker;
    private UserService userService;

    public Facade() {

        usersDBWorker = UsersDBWorker.getInstance();
        userService = new UserService();
    }

    public void doAllJobForUserByLogin(String login) {

        User user = usersDBWorker.getByLogin("Login");

        userService.doAll(user);

        usersDBWorker.deleteByLogin(login);
    }
}
