import java.util.Scanner;

public class ControlStatements {
    public static void main (String[] args){
    // create scanner
    Scanner input = new Scanner(System.in);
    // prompt user to enter a grade
    System.out.println("Enter a grade: ");
    int grade = input.nextInt();}

    public static void chectGrade(int grade){
    
        //decision making statement
        //if (condition){body of code that will reun if the conditon is satisfied}
        if(grade >= 70){
            System.out.println("You're in the top 1%");
        }else{
            System.out.println("You're not in the top 1%");
        }    
        }
        
    }

    

