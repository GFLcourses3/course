package facade;

public class Developer {
    public void workStatus(ProcessTracker processTracker) {
        if (processTracker.getIsSprint()) {
            System.out.println("Developer is working...");
        } else {
            System.out.println("Developer is free...");
        }
    }
}
