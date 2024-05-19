import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args){
    // Write a method to prompt the user for a number then display check if the number is Even or Odd.    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to check if even or odd: ");
    int evenOrOdd = input.nextInt();
    if (evenOrOdd % 2 == 0) {
        System.out.println(evenOrOdd + " is even.");
      } else {
        System.out.println(evenOrOdd + " is odd.");
      }
    
    }
    
}
