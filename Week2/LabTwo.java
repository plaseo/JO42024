package Week2;
import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
        System.out.println("Welcome to Lab TWO!");
        middle3();
        max3();
        min3();
        
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
        int largestInteger = (0);
        int smallestInteger = (0);
        //determine the largest integer
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
        //determine the smallest integer
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
}