package PhoneBookTest;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.contancts.add(new PhoneEntry("John","Xavier","(992)-30421-323"));
        phoneBook.contancts.add(new PhoneEntry("Mary","Doser","(992)-30421-353"));
        phoneBook.contancts.add(new PhoneEntry("George","Sesame","(990)-30421-353"));
        phoneBook.contancts.add(new PhoneEntry("Liam","Xavier","(990)-30211-353"));

        Scanner input = new Scanner(System.in);
        String lastName;
        String firstName;

        do {

            // Prompt the user to enter the name
            System.out.print("Pleast enter the last name to search: ");
            lastName = input.nextLine();

            System.out.print("Please enter the first name to search: ");
            firstName = input.nextLine();

            // search for the person
            Optional<PhoneEntry> entry = phoneBook.search(firstName, lastName);
            List<PhoneEntry> entries = phoneBook.search(lastName);
            // if found, print out the entry
            if (entry.isPresent() && firstName.length() !=0) {
                System.out.println(entry.get().firstName + " " + entry.get().lastName + ": " + entry.get().phone);
            }else if(firstName.length() == 0 && entries.size() !=0 ){
                entries.forEach(e -> System.out.println(e.firstName + " " + e.lastName + ": " + e.phone));
            }
            // if user enter quit, then say good bye
            else if ("quit".equals(lastName)) {
                System.out.println("Good Bye!");
            }
            // if not found, tell the user
            else {
                System.out.println("Name not found.");
            }

        } while (!"quit".equals(lastName));
    }
}
