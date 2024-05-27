package IntroToJava;

import java.util.ArrayList;
import java.util.Scanner;

public class changeMachine {
    public static void main(String[] args) {
        double taxRate = .07;
        double amountDue = (0);
        Scanner input = new Scanner(System.in);

        //figure out how to capture multiple items to add them to subTotal
        //System.out.println("Welcome to The Cash Reg, it's pretty basic around here");
        //System.out.println("Enter t to adjust tax rate, e to exit");
        //System.out.println("Please enter the cost of items one-by-one once finished enter 's' to subtotal")
        //System.out.print(":");
        //double item1 = (input.nextDouble());

         //creates an array of doubles
         Scanner subScanner = new Scanner(System.in);
         ArrayList<Double> nums = new ArrayList<Double>();
         //double doubles = input.nextDouble();
         while (subScanner.hasNextDouble()) {
            nums.add(input.nextDouble());
            }
            double sum = 0;
            for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            }
            System.out.print(sum);
            if(subScanner.hasNext("s")){
                System.out.println("poop");
                
            }else{
                System.out.println("maybe");
            }



        //capture subtotal from input:
        System.out.println("Enter Subtotal: ");
        double subTotal = (input.nextDouble());
        
        //Check if customer is taxExempt
        System.out.print("Is customer tax-exempt(true or false): ");
        boolean taxExempt = input.nextBoolean();
        double taxDue = 0;//figure out taxes due
        if(taxExempt == true){
            taxDue = 0;
        }else{
            taxDue = subTotal * taxRate;
        }
        System.out.println("        Tax: $" + taxDue);

        amountDue = subTotal + taxDue;
        System.out.println(" Amount Due: " + amountDue);

        //capture amount tendered from input:
        System.out.print("Enter amount tendered: ");
        double tendered = (input.nextDouble());
        
        //define denominations (in pennies)
        int dollar = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        
        //calculate out how many pennies are in amountDue & tendered
        double duePennies = amountDue * 100;
        double tendPennies = tendered * 100;
        double changeInPennies = tendPennies - duePennies; //figure out change in pennies
        //cast double change to integer
        int wholePennies = (int) changeInPennies;

        //display dollars in changer
        int dollars = wholePennies / dollar;
        System.out.println("::::Customer Change:::: ");
        System.out.println("    Dollars: " + dollars);
        //figure out leftover pennies after dollars:
        int leftPennies = wholePennies - (dollars * 100);
        System.out.println("Total cents: " + leftPennies);
        //figure out how many quarters are in leftPennies
        int numQuarters = leftPennies / quarter;
        System.out.println("   Quarters: " + numQuarters);
        //calculate how much change after quarters
        int change1 = leftPennies - (numQuarters * quarter);
        //calculate dimes from change1
        int numDimes = change1 / dime;
        System.out.println("      Dimes: " + numDimes);
        //calculate how much change after dimes
        int change2 = change1 - (numDimes * dime);
        //calculate number of nickels from change 2
        int numNickels = change2 / nickel;
        System.out.println("    Nickels: " + numNickels);
        //calculate how much change after nickels which will give us number of pennies
        int numPennies = change2 - (numNickels * nickel);
        System.out.println("    Pennies: " + numPennies);

        // Subtotal 
        // Tax 
        // Total
        // CASH TENDERED
        // CHANGE DUE

    }
}