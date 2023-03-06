package proxy;

public class FunctionExecutorImpl implements FunctionExecutor {
    @Override
    public void doFunction(String function) {
        System.out.println("execute function - " + function);
    }
}
