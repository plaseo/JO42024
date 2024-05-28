package IntroToJava;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class changeMachine {
    public static void main(String[] args) {
        
        double taxRate = .07;
        //double amountDue = (0);
        Scanner input = new Scanner(System.in);

        //figure out how to capture multiple items to add them to subTotal
        System.out.println("Welcome to The Cash Reg, it's pretty basic around here");
        System.out.println("Enter t to adjust tax rate, e to exit(not yet implemented)");
        System.out.println("Please enter the cost of items one-by-one once finished enter 's' to subtotal");

        List<Double> nums = new ArrayList<Double>();
        Scanner subScanner = new Scanner(System.in);
          while (subScanner.hasNextDouble()) {
            nums.add(subScanner.nextDouble());
            }
            double subTotal = 0;
            for (int i = 0; i < nums.size(); i++) {
            subTotal += nums.get(i);
            }
            DecimalFormat df = new DecimalFormat("#.##");
            subTotal = Double.valueOf(df.format(subTotal));
            System.out.println("  Subtotal : " + subTotal);
            
            if(subScanner.hasNext("s")){
                System.out.println("Calculating");
                System.out.println("...");
             }
            
            if(subScanner.hasNext("e")){
                 System.out.println("lol");
            }
 
        //Check if customer is taxExempt
        System.out.print("TaxExempt(true/false): ");
        boolean taxExempt = input.nextBoolean();
        double taxDue = 0;
        if(taxExempt == true){
            taxDue = 0;
        }else{
            taxDue = subTotal * taxRate;//calculate out taxes due
        }
        System.out.println("        Tax: $" + taxDue);

        
        double amountDue = (0);
        amountDue = subTotal + taxDue;
        amountDue = Double.valueOf(df.format(amountDue));
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
        double changeInPennies = tendPennies - duePennies; //calculate out change in pennies
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