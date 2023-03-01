package DTO;

public class Service {
    public UserDTO getUser (){
        UserDTO user = new UserDTO();
        user.setLogin("Login1");
        user.setPassword("Psssword1");
        user.setTimestamp(10l);
        return user;
    }
}
