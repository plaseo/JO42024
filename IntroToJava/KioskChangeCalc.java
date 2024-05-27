package IntroToJava;

public class KioskChangeCalc {

	public static void main(String[] args) {
	double cashGiven = 22;
	double totalSale = 21.1;
	
	//call the function
	returnChange(cashGiven, totalSale);
	
	}
	// function that returns the change and most efficient denominations from a specific sale
	private static double returnChange (double cashGiven, double totalSale) {
	System.out.println("CASH GIVEN: $" + cashGiven);
	System.out.println("TOTAL SALE: $" + totalSale);
	
	// define variables for coins
    double quarter = 0.25;
    double nickel = 0.05;
    double dime = 0.10;
    double penny = 0.01;
	
    // round change to 2 decimal places and calculate
    double change = ((double)((int)((cashGiven - totalSale)*100)) / 100.0 );
    double modQuarters = ((double)((int)((change % quarter)*100)) / 100.0 );
    double modDimes = ((double)((int)((modQuarters % dime)*100)) / 100.0 );
    double modNickels = ((double)((int)((modQuarters % nickel)*100)) / 100.0 );
    double modPennies = ((double)((int)((modQuarters % penny)*100)) / 100.0 );
	
    int numQuarters = (int)((change - modQuarters) / (quarter));
    int numDimes = (int)((modQuarters - modDimes) / (dime));
    int numNickels = (int)((modDimes - modNickels) / (nickel));
    int numPennies = (int)((modNickels - modPennies) / (penny));
    
    
    System.out.println("CHANGE: " + change);
    System.out.println("QUARTERS: " + numQuarters);
    System.out.println("DIMES: " + numDimes);
    System.out.println("NICKELS: " + numNickels);
    System.out.println("PENNIES: " + numPennies);
    
    //Add return statement
	return change;
			
	


}

}


//returnChange(18, 17.18)RESULT:    Quarters: 3   Dimes: 0   Nickels: 1   Pennies: 2