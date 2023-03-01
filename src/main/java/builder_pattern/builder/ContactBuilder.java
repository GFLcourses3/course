package builder_pattern.builder;

import builder_pattern.model.PhoneDTO;
import builder_pattern.product.Contact;

public interface ContactBuilder {
ContactBuilder name(String name);
ContactBuilder surname(String surname);
ContactBuilder phone (PhoneDTO phone);
ContactBuilder email (String email);
Contact build();

}
