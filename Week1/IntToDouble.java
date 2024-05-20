package Week1;
import java.util.Scanner;

public class IntToDouble {

    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int wholeNumber = input.nextInt();
        double inToDouble = (double) wholeNumber;
        System.out.println(inToDouble);
        input.close();


    }
}