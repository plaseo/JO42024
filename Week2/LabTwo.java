package Week2;
import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
        System.out.println("Welcome to Lab TWO!");
        // gives the middle of 3 given numbers
        // middle3();
        // gives the maximum of 3 given numbers
        // max3();
        // gives the minimum of 3 given numbers
        // min3();
        // demonstration of an xor method
        // xor();
        // check if a number is a factor of another
        //isFactor(0, 0);
        isPrime(0);


    }
    // method to determine the largest of three integers
    public static void max3(){
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
            System.out.println(largestInteger);
        }else if(integerTwo >= integerOne && integerTwo >= integerThree){
            largestInteger = integerTwo;
            System.out.println(largestInteger);
        }else{
            largestInteger = integerThree;
            System.out.println(largestInteger);
        }
        // determine the smallest integer
        if(integerOne <= integerTwo && integerOne <= integerThree){
            smallestInteger = integerOne;
            System.out.println(smallestInteger);
        }else if(integerTwo <= integerOne && integerTwo <= integerThree){
            smallestInteger = integerTwo;
            System.out.println(smallestInteger);
        }else{
            smallestInteger = integerThree;
            System.out.println(smallestInteger);
        }
        int middleInteger = integerOne + integerTwo + integerThree - largestInteger - smallestInteger;
        System.out.println(middleInteger);
    }
    // method demonstrating the xor function
    public static void xor(){
        boolean boolOne = false;
        boolean boolTwo = false;
        System.out.println("Please input two booleans");
        Scanner input = new Scanner(System.in);
        boolOne = input.nextBoolean();
        boolTwo = input.nextBoolean();
        //return ((boolOne && !boolTwo) || (!boolOne && boolTwo));
        if ((boolOne && !boolTwo) || (!boolOne && boolTwo)){
            System.out.println("True!");
        }else{
            System.out.println("Drink some water!");
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
        }
    }
    //method which takes an integer and returns true if it is a prime number
    //You must call the isFactor method
    public static boolean isPrime(int someInteger){
        boolean shePrime = (false);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        someInteger = input.nextInt();
        //less than or equal to 1 is NOT prime
        if(someInteger <= 1){
            shePrime = false;
        }
        for (int i = 1; i >= someInteger; i++){
            if(isFactor(i, someInteger)){
                shePrime = false;
            }
        }
        
        shePrime = true;
        System.out.println(shePrime);
        return shePrime;
    }

    }
