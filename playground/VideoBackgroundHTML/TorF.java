package playground.VideoBackgroundHTML;

import java.util.Scanner;

public class TorF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter t/f:");
        boolean parameter1= customParseBoolean(scanner.nextLine());
        System.out.println(parameter1);
        
          
    }
     private static boolean customParseBoolean(String input) {
        if ("t".equals(input)) {
          return true;
        } else if ("f".equals(input)) {
          return false;
        }
        // You don't have to throw an exception on invalid input; just an example.
        throw new IllegalArgumentException("Invalid input: " + input);
      }
    
}
