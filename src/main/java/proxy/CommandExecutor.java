package proxy;

import dto.User;

import java.util.List;

public interface CommandExecutor {

    void printCommand(String command);

    List<User> getAllEmployees();
}
