package DTO;

public class BusinessObject {
    Service service = new Service();
    public UserDTO getUser(){
        return service.getUser();
    }
}
