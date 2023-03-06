package proxy;

public class RunApplication {

    public static void main(String[] args) {
        FunctionExecutor execute_1 = new FunctionExecutorProxyImpl("premiumUser", "premium123");
        execute_1.doFunction("listening");
        execute_1.doFunction("downloading");
        execute_1.doFunction("adding song");
        execute_1.doFunction("deleting song");

        FunctionExecutor execute_2 = new FunctionExecutorProxyImpl("simpleUser", "123");
        execute_2.doFunction("listening");
        execute_2.doFunction("downloading");
        execute_2.doFunction("adding song");
        execute_2.doFunction("deleting song");
    }
}
