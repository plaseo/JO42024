package Week1;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        isLeapYear();
        
    }
    //method to prompt user for 4-digit year and return if year is a leap year
    public static void isLeapYear(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int userYear = input.nextInt();
        if((userYear%4 == 0 && userYear%100 != 0) || (userYear%400==0)){
            System.out.println(userYear + " is a leap year");
        }else{
            System.out.println(userYear + " is not a leap year");
        }
        input.close();

    }
    
}
