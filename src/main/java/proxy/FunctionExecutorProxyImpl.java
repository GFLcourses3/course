package proxy;

public class FunctionExecutorProxyImpl implements FunctionExecutor{

    private boolean isPremium;

    private FunctionExecutor functionExecutor;

    public FunctionExecutorProxyImpl(String username, String password) {
        if (username.equals("premiumUser") && password.equals("premium123")) {
            isPremium = true;
        }
        functionExecutor = new FunctionExecutorImpl();
    }

    @Override
    public void doFunction(String function) {
        if(isPremium) {
            functionExecutor.doFunction(function);
        }
        else {
            if (function.equals("downloading")) {
                System.out.println("Your account is not premium. Only users with account can download music.");
            }
            else if (function.equals("listening")) {
                System.out.println("Remember, you have only 6 skips per hour.");
            }
            else {
                functionExecutor.doFunction(function);
            }
        }
    }
}
