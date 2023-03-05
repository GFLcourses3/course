package patterns.dto_patterns.utils;


import patterns.dto_patterns.dto.UserDTO;
import patterns.dto_patterns.model.User;

public class UserDTOMapper {
    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setAddress(user.getAddress());
        return userDTO;
    }
}