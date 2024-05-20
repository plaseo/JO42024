package Week1;

import java.util.Scanner;

public class Methods {
    public static void main (String[] args){
        // an instance of a class is called an object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number you'd lke to add :");
        int a = input.nextInt();
        System.out.println("Enter the second number :");
        int b = input.nextInt();
        int result = addNumbers(a, b);
        System.out.println("The sum is: " + result);
        input.close();
    }

    //methods and functins are synonymous terms
    //method is a reusable piece of code, methods are actions or behavior
    //access modifier, return type, method name(parameters) { body of code }
    public static int addNumbers(int firstNumber, int secondNumber){
        
        //local variable
        int sum;
        sum = firstNumber + secondNumber;
        return sum;

    }
    
}
