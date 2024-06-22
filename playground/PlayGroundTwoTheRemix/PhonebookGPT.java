import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookGPT {
    private Map<String, String> contacts;

    public PhonebookGPT() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " - " + phoneNumber);
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + " : " + contacts.get(name));
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void listAllContacts() {
        System.out.println("Listing all contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhonebookGPT phonebook = new PhonebookGPT();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add a contact");
            System.out.println("2. Search for a contact");
            System.out.println("3. List all contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    phonebook.searchContact(searchName);
                    break;
                case 3:
                    phonebook.listAllContacts();
                    break;
                case 4:
                    System.out.println("Exiting Phonebook. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }
}

