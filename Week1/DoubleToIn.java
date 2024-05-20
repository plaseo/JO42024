package Week1;

import java.util.Scanner;

public class DoubleToIn {
    public static void main(String[] args) {
        doubleToIn();        
    }
    //method to prompt the user for a double then round to the nearest whole number
    public static void doubleToIn(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double userDouble = input.nextDouble();
        int outInteger = (int) Math.round (userDouble);
        System.out.println(outInteger);
        input.close();

    }












}