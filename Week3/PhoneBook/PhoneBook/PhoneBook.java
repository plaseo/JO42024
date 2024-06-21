package PhoneBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a new phonebook entry");

        List<Person> phonebook = new ArrayList<>();
        
        String fN, lN, mN, pN, bN, sN, cN, sT, zC;
        char quit = 'y';
        while (quit == 'y'){
            System.out.print("Firstname: ");
            fN = input.next();
            System.out.print("Last Name: ");
            lN = input.next();
            System.out.print("Middle Name: ");
            mN = input.next();
            System.out.print("Phone Number: ");
            pN = input.next();
            System.out.print("Building Number: ");
            bN = input.next();
            System.out.print("Street Name: ");
            sN = input.next();
            System.out.print("City: ");
            cN = input.next();
            System.out.print("State: ");
            sT = input.next();
            System.out.print("Zip Code: ");
            zC = input.next();
            Address addy = new Address (bN, sN, cN, sT, zC);
            phonebook.add (new Person(fN, lN, mN, addy, pN));
            System.out.print("Enter another record? y/n:");
            String word = input.next();
            quit = word.charAt(0);
        }
        System.out.print(phonebook);

        List<String> aStringz = new ArrayList<>(phonebook.size());
        for(Object obj : phonebook){
            aStringz.add(Objects.toString(obj, null));
        }
        
        for (String arrayToString : aStringz){
            if (arrayToString.contains("Bo")){
                  System.out.println(arrayToString);
                  
            }

        }
    
    }
}