package builder_pattern.product;

public class ContactImpl implements Contact {
    private final String name;
    private final String phone;
    private final String email;

    public ContactImpl(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ContactImpl{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
