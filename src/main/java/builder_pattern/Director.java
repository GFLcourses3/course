package builder_pattern;


import builder_pattern.builder.ContactBuilder;
import builder_pattern.builder.ContactBuilderImpl;
import builder_pattern.model.ContactDTO;
import builder_pattern.model.PhoneDTO;
import builder_pattern.product.Contact;

public class Director
{
    public static void main( String[] args )
    {
        ContactDTO contactDTO = createContactDTO();
        ContactBuilder builder = new ContactBuilderImpl();
        Contact contact = buildContact(builder, contactDTO);
        System.out.println(contact);
    }
    private static Contact buildContact(ContactBuilder builder, ContactDTO contactDTO ){
       return builder.name(contactDTO.getName())
                .surname(contactDTO.getSurname())
                .phone(contactDTO.getPhone())
                .email(contactDTO.getEmail())
                .build();
    }
    public static ContactDTO createContactDTO() {
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setName("Bob");
        contactDTO.setSurname("Jons");
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setCountryСode("+380");
        phoneDTO.setNumber("123456404");
        contactDTO.setPhone(phoneDTO);
        contactDTO.setEmail("Bob-Jons@gmail.com");
        return contactDTO;

    }
}
