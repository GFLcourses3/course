package dto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        List<User> userList = getAllUsers();
        System.out.println(userList);

        List<UserDTO> userDTOList = convertUserToUserDTO(userList);
        System.out.println(userDTOList);
    }

    private List<UserDTO> convertUserToUserDTO(List<User> userList) {

        return userList.stream().map(x -> new UserDTO(x.getLogin(), x.getPassword())).toList();
    }

    private List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Антон","Глушко","anton2008","anton333222",true));
        userList.add(new User("Дима","Гаражевский","dimagagarage","dimondimon",false));
        return userList;
    }
}
