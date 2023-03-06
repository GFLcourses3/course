package singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "Logs: \n";

    public static ProgramLogger getProgramLogger() {
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {
    }

    public void addLog(String log) {
        logFile += log + "\n";
        System.out.println("Log is added to file.");
    }

    public void showLogFile() {
        System.out.println(logFile);
    }

    public void clearLogFile() {
        logFile = "Logs: \n";
        System.out.println("Logfile is cleared.");
    }
}
