package facade;

public class Facade {
    Worker worker = new Worker();
    Work work = new Work();
    Tracker tracker = new Tracker();
    public void solveProblems(){
        work.doWork();
        tracker.startWork();
        worker.doJob(tracker);
    }
}
