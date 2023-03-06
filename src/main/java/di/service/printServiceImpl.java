package di.service;

import java.util.concurrent.TimeUnit;

public class printServiceImpl implements printService {
    @Override
    public void print(String info) throws InterruptedException {
        for (int i = 0; i < info.length(); i++) {
            System.out.print(info.charAt(i));
            TimeUnit.MILLISECONDS.sleep(300);
        }
    }
}
