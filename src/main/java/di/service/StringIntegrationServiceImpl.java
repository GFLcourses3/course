package di.service;

import java.util.ArrayList;
import java.util.List;

public class StringIntegrationServiceImpl implements StringIntegrationService {

    @Override
    public int sumOfDigits(String text) {

        return sumOfDigitsInList(stringToList(text, new ArrayList<Character>()));
    }

    private List<Character> stringToList(String text, ArrayList<Character> characters) {

        if (text.isEmpty()) return characters;
        else {
            characters.add(text.charAt(0));
            return stringToList(text.substring(1), characters);
        }
    }

    private int sumOfDigitsInList(List<Character> list) {

        if (list.isEmpty()) {
            return 0;
        } else {
            if (Character.isDigit(list.get(0))) {
                return Integer.parseInt(String.valueOf(list.get(0))) + sumOfDigitsInList(list.subList(1, list.size()));
            }
            return sumOfDigitsInList(list.subList(1, list.size()));
        }
    }

}