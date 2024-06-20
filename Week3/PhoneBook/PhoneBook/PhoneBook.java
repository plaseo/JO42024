package PhoneBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a new phonebook entry");
        //Person person = new Person("Bob", "Smith", "Stu", null, "85858585858");
        char quit = 'y';
        String fN, lN, mN;
        List<Person> phonebook = new ArrayList<>();
        while (quit == 'y'){
            System.out.print("Firstname: ");
            fN = input.next();
            System.out.print("Last Name: ");
            lN = input.next();
            phonebook.add (new Person(fN, lN, null, null, null));
            System.out.println("Enter another record? y/n:");
            String word = input.next();
            quit = word.charAt(0);

        }
        System.out.println(phonebook.toString());

        
        //phonebook.add(person);
        // School school = new School();
        // List<Student> studentArray = new ArrayList<>();
        // studentArray.add(s1);
        // school.addStudent(s1);
        // studentArray.add(s2);
        // school.addStudent(s2);

    }
    
    

    
}
