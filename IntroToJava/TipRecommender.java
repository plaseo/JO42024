package IntroToJava;

import java.text.DecimalFormat;

import java.util.Scanner;

public class TipRecommender {

	public static void main(String[] args) {
		// program to give a recommended tip based on service, Great/Good/Poor
		double totalTab = 52.52;
		String serviceQuality = ("Good");
		
		// Create the scanner
		Scanner in = new Scanner(System.in);
		
		// Trying to have the user input totalTab and serviceQuality but it only gives 0 for tip and I can't figure out why
		// Prompt the user to enter total tab
		// System.out.print("Enter total tab: ");
		// double totalTab = in.nextDouble();
		// Prompt the user to enter service quality
		// System.out.print("Enter service quality, Poor/Good/Great:");
		// String serviceQuality = in.next();
		
		//call the function
		double recommendedTip = getRecommendedTip(totalTab, serviceQuality);
		
		// take output for recommendedTip and round to 4 decimal places
		int decimalPlaces = 2;
		DecimalFormat df = new DecimalFormat("#." + "0".repeat(decimalPlaces)); 
		String roundedNumber = df.format(recommendedTip); 
		System.out.println("YOUR RECOMMENDED TIP IS: $" + roundedNumber);
		
		// close the scanner
		in.close();
		

	}
	
	// function that returns the recommended tip based on the amount of the tab and the service performed
	private static double getRecommendedTip(double totalTab, String serviceQuality) {
	System.out.println("TOTAL TAB: $" + totalTab);
	
	// define the variables:
	double tipRate = 0;
	double recommendedTip = 0;
	
	// Determine service type and rate
	if (serviceQuality == "Great") {
		tipRate = .26;
	}	
	else if (serviceQuality == "Good") {
		tipRate = .22;	
	}
	else if (serviceQuality == "Poor") {
		tipRate = .16;
	}
	
	// Calculate the recommended tip
	recommendedTip = totalTab * tipRate;		
	
	//Add return statement
	return recommendedTip;
		
	}
	

}
