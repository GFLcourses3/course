package Facade;

public class Tracker {
    private boolean activeProcess;
    public boolean isActiveProcess(){
        return activeProcess;
    }
    public void startWork(){
        System.out.println("Work is active");
        activeProcess = true;
    }
    public void finishWork(){
        System.out.println("Work is not active");
        activeProcess = false;
    }
}
