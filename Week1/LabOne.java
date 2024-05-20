import java.util.Scanner;
public class LabOne {
    
    public static void main(String[] args) {  
    //Lab 1
     System.out.println("Hello! Welcome to Cameron's simple java methods, please input a number to select a method");
     Scanner input = new Scanner(System.in);
     System.out.println("1. area & circumference of circle");
     System.out.println("2. area of triangle");
     System.out.println("3. is number even or odd");
     System.out.println("4. integer to double");
     System.out.println("5. alphabet ASCII value");
     System.out.println("6. double rounded to nearest whole number");
     System.out.println("7. leap year checker");
     System.out.print("Selection: ");
     int userChoice = input.nextInt();
     if(userChoice == 1){
        areaAndCircumference();
    }
     if(userChoice == 2){
        getAreaOfTriangle();
     }
     if(userChoice == 3){
        evenOrOdd();
     }
     if(userChoice == 4){
        intToDouble();
     }
     if(userChoice == 5){
        asciiAlphabet();
     }
     if(userChoice == 6){
        doubleToIn();
     }
     if(userChoice == 7){
        leapYearChecker();
     }
     System.out.println("Have a great day! :)");
     input.close();
}
    //method to calculate the area and circumference of a circle from given radius
    public static void areaAndCircumference(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double radius = input.nextDouble();
    double circleArea = 3.14 * (radius * radius);
    System.out.println("The area of the cirle is: "  + circleArea);
    double circleCircumference = 2 * 3.14 * radius;
    System.out.println("The circumference of the cirle is: " + circleCircumference);
    input.close();
    }
    //method to get the area of a given triangle
    public static void getAreaOfTriangle(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base-width of triangble: ");
    double baseWidth = input.nextDouble();
    System.out.print("Enter the height of triangle: ");
    double heightTriangle = input.nextDouble();
    double areaOfTriangle = .5 * baseWidth * heightTriangle;
    System.out.println("The area of the triangle is: " + areaOfTriangle);
    input.close();
    }
    //method to determine if a given number is even or odd
    public static void evenOrOdd(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if even or odd: ");
        int evenOrOdd = input.nextInt();
        if (evenOrOdd % 2 == 0) {
            System.out.println(evenOrOdd + " is even.");
        } else {
        System.out.println(evenOrOdd + " is odd.");
        }
    input.close();
    }
    //method to cast a given integer to a double
    public static void intToDouble(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int wholeNumber = input.nextInt();
        double inToDouble = (double) wholeNumber;
        System.out.println(inToDouble);
        input.close();
    }
    //method to get the ASCII value of a given letter
    public static void asciiAlphabet(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a letter : ");
        String userLetter = input.nextLine();
        char letter = userLetter.charAt(0);
        int aValue = (int) letter;
        System.out.println("The acsii value of " + letter + " is " + aValue);
        input.close();
    }
    //method to round a double to the nearest whole number
    public static void doubleToIn(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double userDouble = input.nextDouble();
        int outInteger = (int) Math.round (userDouble);
        System.out.println(outInteger);
        input.close();
    }
    //method to check if a given year is a leap year
    public static void leapYearChecker(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int userYear = input.nextInt();
        if ((userYear & 3) == 0 && ((userYear % 25) != 0 || (userYear & 15) == 0)){
            System.out.println(userYear + " is a leap year");
        }else{
            System.out.println(userYear + " is not a leap year");
        }
        input.close();
    }

    
}
