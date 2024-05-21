package Week2;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //first way of declaring an array
        int[] ages = {23,56,78,90,56,40};
        System.out.println(ages);
        // //declaring an array and specifying it's size, data points may not be known
        // String [] fruits = new String[5];

        //fruits[0] = "Mango";
        //fruits[1] = "Grapes";
        //fruits[2] = "Clementines";
        //fruits[3] = "Banana";
        //fruits[4] = "Apple";

        //System.out.println("Enter :" fruits.length +)

        
        // System.out.println("Enter " + fruits.length + " fruits");
        // Scanner input = new Scanner(System.in);
        // for(int index = 0; index < fruits.length; index++ ){
        //     fruits [index] = input.nextLine();

        // }

        // for(int index = 0; index < fruits.length; index++){
        //     System.out.println(fruits[index]);
        // }

        //for each loop is a simpler and cleaner version of the for loop, but it also has less functionality
        //for(data_type variable: array_name)
        // for (int age : ages){
        //     System.out.println(age);
        // }

        //nested for loop
        //if you're trying toj compare values in an array
        //if you're trying to access values in a 2D array
        //a nested for loop is going to be a combo of outer & inner loop
        //this will allow us to determine if there are any duplicate values in the array
        //outer loop
        for(int i = 0; i < ages.length; i++){
            //inner loop
            for(int j = i + 1; j< ages.length; j++){
                // whatever you're trying to do with your comparison
                if(ages[i] == ages[j]){
                    System.out.println(ages[i] + " is a duplicate");
                }
            }

        }





    }

    
}
