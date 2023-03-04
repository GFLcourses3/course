package builder;

import java.util.Objects;

public class UserBuilder {

    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private Boolean married;
    private Integer age;

    private UserBuilder(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.login = builder.login;
        this.password = builder.password;;
        this.married = builder.married;
        this.age = builder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public Integer getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getMarried() {
        return married;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this.firstName,this.lastName,this.login,this.password,this.married,this.age);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String login;
        private String password;
        private Boolean married;
        private Integer age;
        public Builder() {
        }

        private Builder(String firstName, String lastName, String login, String password, Boolean married, Integer age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.login = login;
            this.password = password;
            this.married = married;
            this.age = age;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setMarried(Boolean married) {
            this.married = married;
            return this;
        }

        public UserBuilder build() {
            return new UserBuilder(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBuilder that = (UserBuilder) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(married, that.married) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, login, password, married, age);
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", married=" + married +
                ", age=" + age +
                '}';
    }
}
