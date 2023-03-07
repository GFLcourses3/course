package facade;

public class Worker {
    public void doJob(Tracker tracker){
        if (tracker.isActiveProcess()==true){
            System.out.println("The worker does the job");
        }
        else System.out.println("The worker is free");
    }
}
