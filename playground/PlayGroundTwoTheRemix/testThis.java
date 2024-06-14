package playground.PlayGroundTwoTheRemix;

import java.util.Scanner;

public class testThis {
    public static void main(String[] args) {  
    //Lab 1

    Scanner input = new Scanner(System.in);
    int userChoice;

    do{
     System.out.println("Hello! Welcome to Cameron's simple java methods, please input a number to select a method");
   
     System.out.println("1. area & circumference of circle");
     System.out.println("2. area of triangle");
     System.out.println("3. is number even or odd");
     System.out.println("4. integer to double");
     System.out.println("5. alphabet ASCII value");
     System.out.println("6. double rounded to nearest whole number");
     System.out.println("7. leap year checker");
     System.out.println("8. Exit the program");
     System.out.print("Selection: ");

     userChoice = input.nextInt();

    
    switch(userChoice){

        case 1:
        
        System.out.println("lol");
        break;

        case 2:
        System.out.println("lol2");
        break;

        case 3:
        System.out.println("lol3");
        break;

        case 4:
        System.out.println("lol4");
        break;

        case 5:
        System.out.println("lol5");
        break;

        case 6:
        System.out.println("lol6");
        break;

        case 7:
        System.out.println("lol7");
        break;

        default:
        System.out.println("Please enter a valid number. ");
    }
     System.out.println("Have a great day! :)");
    }
    while(userChoice != 8);
}
}
