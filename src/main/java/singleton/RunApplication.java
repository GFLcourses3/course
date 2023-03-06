package singleton;

public class RunApplication {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLog("Log1");
        ProgramLogger.getProgramLogger().showLogFile();
        ProgramLogger.getProgramLogger().clearLogFile();
        ProgramLogger.getProgramLogger().addLog("Log2");
        ProgramLogger.getProgramLogger().addLog("Log3");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
