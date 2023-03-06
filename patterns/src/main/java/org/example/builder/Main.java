package org.example.builder;

public class Main {
    public static void main(String[] args) {
        User user1 = User.UserBuilder.newBuilder()
                .setLogin("email.com")
                .setPassword("1111")
                .setTimestamp(100L)
                .built();

        User user2 = User.UserBuilder.newBuilder()
                .setLogin("gmail.com")
                .setPassword("2222")
                .built();

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
