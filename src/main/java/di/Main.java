package di;

import di.factory.AbstractFactrory;
import di.factory.DIFactory;
import di.service.CharacterIntegrationService;
import di.service.StringIntegrationService;

public class Main {
    public static void main(String[] args) {

        AbstractFactrory abstractFactrory = DIFactory.getFactory();

        CharacterIntegrationService characterIntegrationService = abstractFactrory.create(CharacterIntegrationService.class);
        System.out.println(characterIntegrationService.numberToCharacter(150));
        System.out.println(characterIntegrationService.numberToCharacter(120));

        StringIntegrationService stringIntegrationService = abstractFactrory.create(StringIntegrationService.class);
        System.out.println(stringIntegrationService.sumOfDigits("Hello, 2023!"));

        AbstractFactrory abstractFactrory1 = DIFactory.getFactory();

        StringIntegrationService stringIntegrationService1 = abstractFactrory1.create(StringIntegrationService.class);
        System.out.println(stringIntegrationService1.sumOfDigits("Hello, 2022!"));
    }
}
