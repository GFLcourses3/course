package di.factory;

import di.service.broadcastService;
import di.service.broadcastServiceImpl;
import di.service.printService;
import di.service.printServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class DIFactory implements AbstractFactory {

    private final Map<Class, Object> storage;

    private static DIFactory diFactory;

    public static DIFactory getFactory() {
        if (diFactory == null) {
            diFactory = new DIFactory();
        }
        return diFactory;
    }

    private DIFactory() {
        storage = new HashMap<>();
    }

    @Override
    public <T> T create(Class<T> classT) {

        if (printService.class.isAssignableFrom(classT)) {
            Object object = storage.get(classT);
            if (object == null) {
                printService printService = new printServiceImpl();
                storage.put(classT,printService);
                return (T) printService;
            }
            return (T) object;
        }

        if (broadcastService.class.isAssignableFrom(classT)) {
            Object object = storage.get(classT);
            if (object == null) {
                broadcastService broadcastService = new broadcastServiceImpl();
                storage.put(classT,broadcastService);
                return (T) broadcastService;
            }
            return (T) object;
        }

        return null;
    }
}