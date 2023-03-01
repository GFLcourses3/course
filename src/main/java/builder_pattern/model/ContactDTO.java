package builder_pattern.model;

public class ContactDTO {
    private String name;
    private String surname;
    private PhoneDTO phoneDTO;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PhoneDTO getPhone() {
        return phoneDTO;
    }

    public void setPhone(PhoneDTO phoneDTO) {
        this.phoneDTO = phoneDTO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    }

