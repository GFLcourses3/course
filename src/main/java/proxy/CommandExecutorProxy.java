package proxy;

import dto.User;

import java.util.List;

public class CommandExecutorProxy implements CommandExecutor{

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(Role role) {

        if (role == Role.ADMIN) {
            isAdmin = true;
            commandExecutor = new CommandExecutorImpl();
        } else isAdmin = false;
    }

    @Override
    public void printCommand(String command) {

        if (isAdmin) {
            commandExecutor.printCommand(command);
        } else {
            System.out.println("You don't have permission");
        }
    }

    @Override
    public List<User> getAllEmployees() {
        if (isAdmin) {
            return commandExecutor.getAllEmployees();
        }
        return null;
    }
}
