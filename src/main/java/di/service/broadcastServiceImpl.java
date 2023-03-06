package di.service;

import java.util.concurrent.TimeUnit;

public class broadcastServiceImpl implements broadcastService {
    @Override
    public void broadcast(String info, Integer seconds) throws InterruptedException {
        System.out.println();
        System.out.println();
        for (int i = 0; i < seconds; i++) {
            System.out.println(info);
            TimeUnit.MILLISECONDS.sleep(1000);
        }
    }
}
