import java.util.Scanner;

public class AreaOfTriangle {
    public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the base-width of triangble: ");
   double baseWidth = input.nextDouble();
   System.out.println("Enter the height of triangle: ");
   double heightTriangle = input.nextDouble();
   getAreaOfTriangle(baseWidth, heightTriangle);
   input.close();
}
    //Method to prmpt the user for base-width and height of triangle, then calculate area
    private static double getAreaOfTriangle(double baseWidth, double heightTriangle) {
    double areaOfTriangle = .5 * baseWidth * heightTriangle;
    System.out.println(areaOfTriangle);
    return areaOfTriangle;

    }

}
