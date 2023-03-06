package di;

import di.factory.AbstractFactory;
import di.factory.DIFactory;
import di.service.broadcastService;
import di.service.printService;

public class RunApplication {
    public static void main(String[] args) throws InterruptedException {
        AbstractFactory abstractFactory = DIFactory.getFactory();

        String info = "hi everybody!";

        printService printService = abstractFactory.create(printService.class);
        printService.print(info);

        Thread.sleep(2000);

        broadcastService broadcastService = abstractFactory.create(broadcastService.class);
        broadcastService.broadcast(info, 10);
    }
}
