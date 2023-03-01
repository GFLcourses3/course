package DTO;

import java.util.Objects;

public class UserDTO {
    String login;
    String password;
    Long timestamp;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UserDTO(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    public UserDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(login, userDTO.login) && Objects.equals(password, userDTO.password) && Objects.equals(timestamp, userDTO.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
