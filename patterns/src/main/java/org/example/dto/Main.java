package org.example.dto;

public class Main {
    public static void main(String[] args) {
        UserStorage userStorage = new UserStorage();
        UserModel user1 = new UserModel("log1", "1111", 4311L);
        UserModel user2 = new UserModel("log2", "2222", 1143L);

        System.out.println(user1);
        System.out.println(user2);

        userStorage.addUser(user1);
        userStorage.addUser(user2);
        userStorage.getAllUsers().forEach(System.out::println);
    }
}