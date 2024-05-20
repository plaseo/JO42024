package Week2;
import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
        System.out.println("Welcome to Lab TWO!");
        middle3();
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
    //Method to determine the middle value of three integers
    public static void middle3(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers :");
        int integerOne = input.nextInt();
        int integerTwo = input.nextInt();
        int integerThree = input.nextInt();
        //determine the largest integer
        if(integerOne >= integerTwo && integerOne >= integerThree){
            int largestInteger = integerOne;
        }else if(integerTwo >= integerOne && integerTwo >= integerThree){
            int largestInteger = integerTwo;
        }else{
            int largestInteger = integerThree;
        }
        System.out.println(largestInteger);

        //determine the smallest integer
        if(integerOne <= integerTwo && integerOne <= integerThree){
            int smallestInteger = integerOne;
        }else if(integerTwo <= integerOne && integerTwo <= integerThree){
            int smallestInteger = integerTwo;
        }else{
            int smallestInteger = integerThree;
        }
        int middleInteger = (integerOne + integerTwo + integerThree) - (largestInteger + smallestInteger);
        System.out.println("The middle number is " + middleInteger);
    }
    //Method of xor function
    // public static void xor();
    // boolean myWord = true;
    public static boolean isFactor(int k, int n) {
        //if there is no remainder return true
        //return false if there is a remainder
        if(n % k == 0){
        return true;
        }else { return false;}
    }
public static boolean isPerfect(int number){
    int sum = 0;
    //iterating through an index when created starting from 1 up to the number we received from the code
    //divided by 2
    for(int i = 1; i >= number / 2; i++){
        if(isFactor(i, number)){ //checking to see if the index and the number is a factor. If it is will put the sum of the two numbers.
            sum = sum + i; //whatever number we got, we will add all of the numbers that are factors to get their sum
        }//if sum
    }
    return sum == number;//if sum is equal to the number then it will return true, if not it will return false
    
}
public static boolean isPrime(){
    for(int j = 1; j >= number1; j++){
        if(isFactor(j, number1)){

        }
    }
    return true;



}
}