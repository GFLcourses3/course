package di.factory;

import di.service.CharacterIntegrationService;
import di.service.CharacterIntegrationServiceImpl;
import di.service.StringIntegrationService;
import di.service.StringIntegrationServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class DIFactory implements AbstractFactrory {

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
    public <T> T create(Class<T> tClass) {

        if (CharacterIntegrationService.class.isAssignableFrom(tClass)) {
            Object object = storage.get(tClass);
            if (object == null) {
                CharacterIntegrationService characterIntegrationService = new CharacterIntegrationServiceImpl();
                storage.put(tClass,characterIntegrationService);
                return (T) characterIntegrationService;
            }
            return (T) object;
        }

        if (StringIntegrationService.class.isAssignableFrom(tClass)) {
            Object object = storage.get(tClass);
            if (object == null) {
                StringIntegrationService stringIntegrationService = new StringIntegrationServiceImpl();
                storage.put(tClass,stringIntegrationService);
                return (T) stringIntegrationService;
            }
            return (T) object;
        }

        return null;
    }
}
