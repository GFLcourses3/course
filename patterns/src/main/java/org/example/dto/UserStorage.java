package org.example.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserStorage {
    List<UserModel> userModels;

    public UserStorage() {
        userModels = new ArrayList<>();
    }

    public void addUser(UserModel userModel){
        userModels.add(userModel);
    }

    public void removeUser(UserModel userModel){
        userModels.remove(userModel);
    }

    public List<UserDTO> getAllUsers() {
        return userModels.stream().map(user -> new UserDTO(user.getLogin(), user.getPassword(), user.getTimestamp()))
                .collect(Collectors.toList());
    }
}
