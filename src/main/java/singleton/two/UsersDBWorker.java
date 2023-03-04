package singleton.two;

import dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class UsersDBWorker {

    private PreparedStatement preparedStatement;
    private Connection connection;
    private static UsersDBWorker usersDBWorker;

    private UsersDBWorker() {
        this.connection = DBManager.getConnection();
    }

    public static UsersDBWorker getInstance() {
        if (usersDBWorker == null) {
            usersDBWorker = new UsersDBWorker();
        }
        return usersDBWorker;
    }
    public User getByLogin(String login) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }

    public void save(User o) {}

    public void update(User user) {}

    public void deleteByLogin(String login) {}
}
