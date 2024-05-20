package Week1;

import java.util.Scanner;

public class AreaOfTriangle {
public static void main (String[] args){
   getAreaOfTriangle();
}
    //method to get the area of a given triangle
    private static double getAreaOfTriangle(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base-width of triangle: ");
    double baseWidth = input.nextDouble();
    System.out.print("Enter the height of triangle: ");
    double heightTriangle = input.nextDouble();
    double areaOfTriangle = .5 * baseWidth * heightTriangle;
    System.out.println("The area of the triangle is: " + areaOfTriangle);
    input.close();
    return areaOfTriangle;
    }


}




//Method to prmpt the user for base-width and height of triangle, then calculate area