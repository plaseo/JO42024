package Week1;

import java.util.Scanner;

public class CircumferenceCircle {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double radius = input.nextDouble();
    double circleArea = 3.14 * (radius * radius);
    System.out.println("The area of the cirle is: "  + circleArea);
    double circleCircumference = 2 * 3.14 * radius;
    System.out.println("The circumference of the cirle is: " + circleCircumference);
    input.close();
    }
}
