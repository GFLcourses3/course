package dto.service;

import dto.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();

    UserDTO getById(Integer id) throws Exception;
}
