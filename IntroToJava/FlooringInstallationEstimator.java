package IntroToJava;

public class FlooringInstallationEstimator {

	public static void main(String[] args) {
		int squareFeet = 2000;
		String floorType = "Carpet";
		
		// Call the getQuote Function
		double quote = getQuote(squareFeet, floorType);
		
		System.out.println("Your quote is: $" + quote);
		
	}
	
	/*
	Base: 3 per  sq ft 
	Carpet: .50 per sq ft
	Hardwood: 1.50 per sq ft
	If square feet is over 1500, then apply a 10% discount
	*/
	
	// Define the quote function
	// Parameters: square feet, floor type
	private static double getQuote(int squareFeet, String floorType) {
		System.out.println("QUOTE FUNCTION");
		System.out.println("SQUARE FEET: " + squareFeet);
		System.out.println("FLOOR TYPE: " + floorType);
		
		// Define the variables
		double baseRate = 3;
		double carpetRate = .5;
		double hardwoodRate = 1.5;
		double hardwoodHardwareFee = 100;
		double totalRate = 0;
		double totalCost = 0;
		
		// Determine floor type and rate
		if (floorType == "Carpet") {
			totalRate = baseRate + carpetRate;
		}
		else if (floorType == "Hardwood") {
			totalRate = baseRate + hardwoodRate;
			totalCost = totalCost + hardwoodHardwareFee;
		}
		else {
			System.out.println("ERROR: COULD NOT READ FLOOR TYPE");
		}
		
		// Calculate the total cost
		System.out.println("Total Rate: " + totalRate);
		totalCost =  totalCost + totalRate * squareFeet;
		
		// Apply any appropriate discount
		if (squareFeet >= 1500) {
			double discount = totalCost * .1;
			totalCost = totalCost - discount;
			System.out.println("DISCOUNT: " + discount);
			
		}
		
		System.out.println("$" + totalCost);
		
		// Add return statement
		return totalCost;
	}

}
