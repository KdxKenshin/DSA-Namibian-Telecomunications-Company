package NamTeleCompany;
import java.util.ArrayList;
public class Phonebook {
     ArrayList<Contacts> contacts;

    Phonebook() {
        contacts = new ArrayList<>();
    }

    public void insertContact(String name, String number) {
        contacts.add(new Contacts(name, number));
        System.out.println("Contact inserted: " + name);
    }

    public void searchContact(String name) {
        for (Contacts contact : contacts) {
            if (contact.name.equals(name)) {
                System.out.println("Contact found: " + contact.name + " - " + contact.number);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contacts contact : contacts) {
            System.out.println(contact.name + " - " + contact.number);
        }
    }

    public void deleteContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equals(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void updateContact(String name, String newNumber) {
        for (Contacts contact : contacts) {
            if (contact.name.equals(name)) {
                contact.number = newNumber;
                System.out.println("Contact updated: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void sortContacts() {
        contacts.sort((c1, c2) -> c1.name.compareToIgnoreCase(c2.name));
        System.out.println("Contacts sorted.");
    }
}

