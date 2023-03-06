package dto.repository;

import dto.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User getById(Integer id) throws Exception;
}
