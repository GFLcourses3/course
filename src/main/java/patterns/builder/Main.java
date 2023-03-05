package patterns.builder;

import patterns.builder.model.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder()
                .id(1)
                .firstName("Dmytro")
                .lastName("Tatarynov")
                .address("Stein, st. Tripsstraat 5")
                .login("dmytro_tatarynov")
                .password("qwerty123")
                .timestamp(System.currentTimeMillis())
                .build();

        User user2 = new User.Builder()
                .id(2)
                .firstName("Dmytro2")
                .lastName("Tatarynov2")
                .address("Bakhmut, st. Levanevskogo 16")
                .login("dmytro_tatarynov")
                .password("qwerty123456")
                .timestamp(System.currentTimeMillis())
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
