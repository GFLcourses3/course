package DTO;

public class Client {
    public static void main( String[] args ){
        BusinessObject BO = new BusinessObject();
        System.out.println(BO.getUser().getLogin() + " " +
        BO.getUser().getPassword() + " " +
        BO.getUser().getTimestamp());

    }
}
