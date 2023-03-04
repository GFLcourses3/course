package builder;

public class Main {

    public static void main(String[] args) {

        UserBuilder userBuilder = UserBuilder.newBuilder()
                .setAge(9)
                .setLogin("login-1")
                .setPassword("password-1")
                .build();

        System.out.println(userBuilder);
    }
}
