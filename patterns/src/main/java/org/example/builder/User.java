package org.example.builder;

public class User {
    private String login;
    private String password;
    private Long timestamp;

    public User(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class UserBuilder {
        private String login;
        private String password;
        private Long timestamp;

        public static UserBuilder newBuilder(){
            return new UserBuilder();
        }

        public User built(){
            return new User(login, password, timestamp);
        }
        public UserBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
    }
}
