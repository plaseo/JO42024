package playground;

import java.util.Scanner;

public class isPrimeMaybe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check for prime");
        int userPrime = input.nextInt();
        if(isPrime(userPrime)){
            System.out.println("IS PRIME");
        }else{System.out.println("NotPrime");
        }
    public static boolean isPrime(int userInput){
        //number less than or equal to 1 is not prime
        if(userInput <= 1){
            return false;
        }
      //iterates through and checks if factor  
      for(int i = 2; i < userInput; i++){
      if(isFactor(i,userInput)){
        return false;
      }
      }
      //if no factors are found, prime
      return true;
     }
    }





}