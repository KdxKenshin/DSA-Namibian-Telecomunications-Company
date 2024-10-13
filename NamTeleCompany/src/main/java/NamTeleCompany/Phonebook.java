package NamTeleCompany;
import java.util.ArrayList;
public class Phonebook {
     ArrayList<Contacts> contacts;

    Phonebook() {
        contacts = new ArrayList<>();
    }

    public void insertContact(String name, String number) {
        try{
        contacts.add(new Contacts(name, number));
        System.out.println("Contact inserted: " + name + " - " + number);
    } catch (Exception e) {
            System.out.println("An error occurred while inserting contact: " + " " + e.getMessage());
        }
    }
    public void searchContact(String name) {
        try{
        for (Contacts contact : contacts) {
            if (contact.name.equals(name)) {
                System.out.println("Contact found: " + contact.name + " - " + contact.number);
                return;
            }
        }
        System.out.println("Contact not found.");
        } catch (Exception e) {
            System.out.println("An error occurred while searching for the contact: " + " " + e.getMessage());
        }
    }

    public void displayContacts() {
        try{
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contacts contact : contacts) {
            System.out.println(contact.name + " - " + contact.number);
        }
        } catch (Exception e) {
            System.out.println("An error occurred while displaying contacts: " + " " + e.getMessage());
        }
    }

    public void deleteContact(String name) {
        try{
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equals(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
    } catch (Exception e) {
            System.out.println("An error occurred while deleting contact: " + " " + e.getMessage());
        }
    }

    public void updateContact(String name, String newNumber) {
        try{
        for (Contacts contact : contacts) {
            if (contact.name.equals(name)) {
                contact.number = newNumber;
                System.out.println("Contact has been updated: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
        }catch (Exception e) {
            System.out.println("An error occurred while updating contact: " + " " + e.getMessage());
        }
    }
    
     public void bubbleSortContacts() {
         try{
        int n = contacts.size();
        if (n <= 1) {
            System.out.println("Nothing to sort.");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (contacts.get(j).name.compareToIgnoreCase(contacts.get(j + 1).name) > 0) {
                    // Swap contacts
                    Contacts temp = contacts.get(j);
                    contacts.set(j, contacts.get(j + 1));
                    contacts.set(j + 1, temp);
                }
            }
        }
        System.out.println("Contacts sorted:");
         }catch (Exception e) {
            System.out.println("An error occurred while sorting contacts: " + " " + e.getMessage());
        }
    }
    
     public void markAsFavourite(String name) {
         try{ 
        for (Contacts contact : contacts) {
            if (contact.name.equals(name)) {
                contact.setFavourite(true);
                System.out.println(name + " has been marked as a favourite.");
                return;
            }
        }
        System.out.println("Contact not found.");
         }catch (Exception e) {
            System.out.println("An error occurred while marking favourite contact: " + " " + e.getMessage());
        }
    }
     
     public void unmarkAsFavorite(String name) {
         try{
        for (Contacts contact : contacts) {
            if (contact.name.equals(name)) {
                contact.setFavourite(false);
                System.out.println(name + " has been unmarked as a favourite.");
                return;
            }
        }
        System.out.println("Contact not found.");
         }catch (Exception e) {
            System.out.println("An error occurred while unmarking favourite contact: " + " " + e.getMessage());
        }
    } 
     
     public void displayFavourites() {
         try{
        boolean hasFavourites = false;
        for (Contacts contact : contacts) {
            if (contact.isFavourite()) {
                System.out.println(contact);
                hasFavourites = true;
            }
        }
        if (!hasFavourites) {
            System.out.println("No favorite contacts available.");
        }
         }catch (Exception e) {
            System.out.println("An error occurred while displaying favourite contacts: " + " " + e.getMessage());
        }
         
    }    
}
