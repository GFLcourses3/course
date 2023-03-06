package dto.repository;

import dto.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAll() {
        return mockUsers();
    }

    @Override
    public User getById(Integer id) throws Exception {
        return mockUsers().stream().filter(user -> Objects.equals(user.getId(), id)).findFirst().orElseThrow(() -> new Exception("UserNotFound"));
    }

    private List<User> mockUsers() {
        return List.of(new User(1, "User_1", "1234", "Ivan_1", "Ivanov_1", 34, Boolean.TRUE),
                                    new User(2, "User_2", "1235", "Ivan_2", "Ivanov_2", 35, Boolean.FALSE),
                                    new User(3, "User_3", "1236", "Ivan_3", "Ivanov_3", 36, Boolean.TRUE),
                                    new User(4, "User_4", "1237", "Ivan_4", "Ivanov_4", 37, Boolean.FALSE));
    }
}
