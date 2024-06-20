import java.util.Scanner;
import java.util.ArrayList;

public class ExceptionDriver
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Document> someStuff = new ArrayList<Document>();
        char quit = 'Y';
        String firstname, lastname;
        int code;

            while (quit == 'Y')
            {
                System.out.print("\n First Name: ");
                firstname = scan.next();

                System.out.print(" Last Name: ");
                lastname = scan.next();

                System.out.print(" Document Code: ");
                code = scan.nextInt();

                someStuff.add (new Document(lastname, firstname, code));

                System.out.print(" Enter Another Record? (Y/N)");
                String word = scan.next();
                word = word.toUpperCase();
                quit= word.charAt(0);
            }


            for(Document stuff : someStuff)
            System.out.println(stuff);
    }

}
