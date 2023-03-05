package patterns.dto.utils;


import patterns.dto.dto.UserDTO;
import patterns.dto.model.User;

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