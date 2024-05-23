package Week2;
import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
        System.out.println("Welcome to Lab TWO!");
        System.out.println("Please enter a number to select an option");
        System.out.println("1. determine the largest of 3 integers");
        System.out.println("2. determine the smallest of 3 integers");
        System.out.println("3. compare 3 integers");
        System.out.println("4. demonstration of xor");
        System.out.println("5. check if an integer is perfect");
        System.out.println("6. check if an integer is prime");
        System.out.print("Selection: ");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        if(userChoice == 1){
            max3();
        }
         if(userChoice == 2){
            min3();
         }
         if(userChoice == 3){
            middle3();
         }
         if(userChoice == 4){
            xor();
         }
         if(userChoice == 5){
            isPerfect();
         }
         if(userChoice == 6){
            System.out.println("Enter a number to check for prime");
        int userPrime = input.nextInt();
        if(isPrime(userPrime)){
            System.out.println("IS PRIME");
        }else{System.out.println("Not Prime");
        }
         }
         System.out.println("Have a great day! :)");

    }
    // method to determine the largest of three integers
    public static void max3(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers :");
        int integerOne = input.nextInt();
        int integerTwo = input.nextInt();
        int integerThree = input.nextInt();
        if(integerOne >= integerTwo && integerOne >= integerThree){
            System.out.println(integerOne + " is the largest integer");
        }else if(integerTwo >= integerOne && integerTwo >= integerThree){
            System.out.println(integerTwo + " is the largest integer");
        }else{System.out.println(integerThree + " is the largest integer");
        }
    }
    // method to determine the smallest of three integers
    public static void min3(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers :");
        int integerOne = input.nextInt();
        int integerTwo = input.nextInt();
        int integerThree = input.nextInt();
        if(integerOne <= integerTwo && integerOne <= integerThree){
            System.out.println(integerOne + " is the smallest integer");
        }else if(integerTwo <= integerOne && integerTwo <= integerThree){
            System.out.println(integerTwo + " is the smallest integer");
        }else{System.out.println(integerThree + " is the smallest integer");
        }
    }
    // Method to determine the middle value of three integers
    public static void middle3(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers :");
        int integerOne = input.nextInt();
        int integerTwo = input.nextInt();
        int integerThree = input.nextInt();
        int largestInteger = (0);
        int smallestInteger = (0);
        // determine the largest integer
        if(integerOne >= integerTwo && integerOne >= integerThree){
            largestInteger = integerOne;
            System.out.println(largestInteger + " is the largest integer ");
        }else if(integerTwo >= integerOne && integerTwo >= integerThree){
            largestInteger = integerTwo;
            System.out.println(largestInteger + " is the largest integer ");
        }else{
            largestInteger = integerThree;
            System.out.println(largestInteger+ " is the largest integer ");
        }
        // determine the smallest integer
        if(integerOne <= integerTwo && integerOne <= integerThree){
            smallestInteger = integerOne;
            System.out.println(smallestInteger + " is the smallest integer ");
        }else if(integerTwo <= integerOne && integerTwo <= integerThree){
            smallestInteger = integerTwo;
            System.out.println(smallestInteger + " is the smallest integer ");
        }else{
            smallestInteger = integerThree;
            System.out.println(smallestInteger + " is the largest integer ");
        }
        int middleInteger = integerOne + integerTwo + integerThree - largestInteger - smallestInteger;
        System.out.println(middleInteger + " is the middle integer ");
    }
    // method demonstrating the xor function
    public static void xor(){
        boolean boolOne = false;
        boolean boolTwo = false;
        System.out.println("Please input two booleans");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        boolOne = input.nextBoolean();
        boolTwo = input.nextBoolean();
        //return ((boolOne && !boolTwo) || (!boolOne && boolTwo));
        if ((boolOne && !boolTwo) || (!boolOne && boolTwo)){
            System.out.println("True!");
        }else{
            System.out.println("Drink some water! also false");
        }
    }
    // method which takes two integers (k and n) and returns true if k is a factor of n
    public static boolean isFactor(int k, int n){
        if(n % k ==0){
            return true;

        }else{
            return false;
        }
    }
    //method which takes an integer and returns true if that integer is a perfect number
    public static void isPerfect(){
        int totalFactors = 0;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer");
        int userInteger = input.nextInt();
        for (int i = 1;i<userInteger;i++){
            if(isFactor(i, userInteger) == true){
                totalFactors = totalFactors + i;
        }
        }
        if(totalFactors == userInteger){
            System.out.println(userInteger + " is a perfect number!");
        }else{
            System.out.println(userInteger + " is not a perfect number!");
        }
    }
    //method which takes an integer and returns true if it is a prime number
    //You must call the isFactor method
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

