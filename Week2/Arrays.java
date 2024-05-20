package Week2;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //first way of declaring an array
        int[] ages = {23,56,78,90,56,40};
        System.out.println(ages);
        //declaring an array and specifying it's size, data points may not be known
        String [] fruits = new String[5];

        //fruits[0] = "Mango";
        //fruits[1] = "Grapes";
        //fruits[2] = "Clementines";
        //fruits[3] = "Banana";
        //fruits[4] = "Apple";

        //System.out.println("Enter :" fruits.length +)

        
        System.out.println("Enter " + fruits.length + " fruits");
        Scanner input = new Scanner(System.in);
        for(int index = 0; index < fruits.length; index++ ){
            fruits [index] = input.nextLine();

        }

        for(int index = 0; index < fruits.length; index++){
            System.out.println(fruits[index]);
        }
        




    }

    
}
