package NamTeleCompany;
import java.util.Scanner;
public class NamTeleCompany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          Phonebook phonebook = new Phonebook();
        int num;
        try{
         do {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Insert Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Update Contact");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Mark As Favourite");
            System.out.println("8. Unmark As Favourite");
            System.out.println("9. Display Favourite Contacts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            num = sc.nextInt();
            sc.nextLine();
             
            switch (num) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter number: ");
                    String number = sc.nextLine();
                    phonebook.insertContact(name, number);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    phonebook.searchContact(searchName);
                    break;
                case 3:
                    phonebook.displayContacts();
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();
                    phonebook.deleteContact(deleteName);
                    break;
                case 5:
                    System.out.print("Enter name to update: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter new number: ");
                    String newNumber = sc.nextLine();
                    phonebook.updateContact(updateName, newNumber);
                    break;
                case 6:
                    phonebook.bubbleSortContacts();
                    phonebook.displayContacts();
                    break;
                case 7:
                    System.out.print("Enter name to mark as favourite: ");
                    String fName = sc.nextLine();
                    phonebook.markAsFavourite(fName);
                    break;
                case 8:
                    System.out.print("Enter name to unmark as favourite: ");
                    String ufName = sc.nextLine();
                    phonebook.unmarkAsFavorite(ufName);
                    break;
                case 9:
                    phonebook.displayFavourites();
                    break;
                case 0:
                    System.out.print("Exiting Phonebook.");
                    break;
                default:
                    System.out.print("Invalid choice. Please try again.");
            }
        } while (num != 0);

        sc.close();
    }
    catch (Exception e) {
            System.out.println("An Error Occured while running the program" + " " + e.getMessage());
        }
    }
}
