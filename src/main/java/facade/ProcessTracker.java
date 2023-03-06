package facade;

public class ProcessTracker {
    private boolean isSprint;

    public boolean getIsSprint() {
        return isSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active...");
        isSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is over...");
        isSprint = false;
    }
}
