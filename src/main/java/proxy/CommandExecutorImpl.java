package proxy;

import dto.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void printCommand(String command) {
        System.out.println(command);
    }

    @Override
    public List<User> getAllEmployees() {
        return new ArrayList<>();
    }
}
