package patterns.dto_patterns;

import patterns.dto_patterns.dto.UserDTO;
import patterns.dto_patterns.model.User;

import static patterns.dto_patterns.utils.UserDTOMapper.convert;

public class Main {
    public static void main(String[] args) {
        // создаем объект User
        User user = new User();
        user.setId(1);
        user.setFirstName("Дмитро");
        user.setLastName("Татаринов");
        user.setAddress("Stein, st. Tripsstraat 5");
        user.setLogin("dmytro_tatarynov");
        user.setPassword("qwerty123");
        user.setTimestamp(System.currentTimeMillis());

        // конвертируем объект User в объект UserDTO
        UserDTO userDTO = convert(user);

        // выводим значения полей объекта UserDTO
        System.out.println("ID: " + userDTO.getId());
        System.out.println("Имя: " + userDTO.getFirstName());
        System.out.println("Фамилия: " + userDTO.getLastName());
        System.out.println("Адрес: " + userDTO.getAddress());
    }

}
