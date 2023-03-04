package di.service;

import di.service.CharacterIntegrationService;

public class CharacterIntegrationServiceImpl implements CharacterIntegrationService {
    @Override
    public Character numberToCharacter(int characterNumber) {
        return (char) characterNumber;
    }
}
