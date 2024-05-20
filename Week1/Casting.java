package Week1;

public class Casting {
    public static void main (String[] args){
    double number = 5.45;

    System.out.println(number);

    // convert a double to an integer
    int newNumber = (int) number;
    System.out.println(newNumber);

    // convert an int to double
    int numberOfSticks = 55;
    double dblNumberOfSticks = (double) numberOfSticks;
    System.out.println(dblNumberOfSticks);

    //converting character to their numberic values
    char symbol = '@';
    int asciiValue = (int) symbol;
    System.out.println("The ASCII value is: " + asciiValue);

    }
}
