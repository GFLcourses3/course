package builder_pattern.builder;

import builder_pattern.model.PhoneDTO;
import builder_pattern.product.Contact;
import builder_pattern.product.ContactImpl;

public class ContactBuilderImpl implements ContactBuilder{
    private String name;
    private String surname;
    private String phone;
    private String email;
    private ContactImpl contact;

    @Override
    public ContactBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ContactBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public ContactBuilder phone(PhoneDTO phone) {
        this.phone = phone.getCountryСode()+phone.getNumber();
        return this;
    }

    @Override
    public ContactBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Contact build() {
        contact = new ContactImpl(surname + " " + name, phone, email);
        return contact;
    }
}
