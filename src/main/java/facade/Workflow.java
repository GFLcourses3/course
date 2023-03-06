package facade;

import java.util.concurrent.TimeUnit;

public class Workflow {
    int problems;
    Project project = new Project();
    ProcessTracker processTracker = new ProcessTracker();
    Developer developer = new Developer();

    public void solveProblems() throws InterruptedException {
        project.doProject();
        TimeUnit.SECONDS.sleep(1);
        processTracker.startSprint();
        TimeUnit.SECONDS.sleep(1);
        developer.workStatus(processTracker);
        TimeUnit.SECONDS.sleep(5); //time for solving
        processTracker.finishSprint();
        TimeUnit.SECONDS.sleep(1);
        developer.workStatus(processTracker);
        TimeUnit.SECONDS.sleep(1);
        project.release();
    }
}
