package dto.service;

import dto.dto.UserDTO;
import dto.model.User;
import dto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAll() {
        return userRepository.getAll().stream().map(user -> new UserDTO(user.getUsername(), user.getFirstName(), user.getLastName(), user.getAge())).collect(Collectors.toList());
    }

    @Override
    public UserDTO getById(Integer id) throws Exception {
        User user = userRepository.getById(id);
        return new UserDTO(user.getUsername(), user.getFirstName(), user.getLastName(), user.getAge());
    }
}
