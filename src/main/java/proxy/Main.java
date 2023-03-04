package proxy;

import dto.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CommandExecutor commandExecutor1 = new CommandExecutorProxy(Role.BASIC_USER);
        CommandExecutor commandExecutor2 = new CommandExecutorProxy(Role.ADMIN);

        List<User> allEmployees1 = commandExecutor1.getAllEmployees();
        System.out.println(allEmployees1);

        List<User> allEmployees2 = commandExecutor2.getAllEmployees();
        System.out.println(allEmployees2);

        commandExecutor1.printCommand("Hello, GeeksForLess");
        commandExecutor2.printCommand("Hello, GeeksForLess");
    }
}
