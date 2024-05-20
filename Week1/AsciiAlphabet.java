package Week1;

import java.util.Scanner;

public class AsciiAlphabet {
    //Write a method to prompt the user for a letter of the alphabet and display it's ascii value
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a letter : ");
    String userInput = input.nextLine();
    char letter = userInput.charAt(0);
    int aValue = (int) letter;
    System.out.println("The letter is: " + letter);
    System.out.println("The acsii value is " + aValue);
    input.close();
    }
    


}
