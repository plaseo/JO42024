package IntroToJava;

public class SavingsCalculator {

	public static void main(String[] args) {
		double presentValue = 20000;
		double interestRate = 4.5;
		double timeSpan = 15;
		
		// Call the getFutureValue Function
		double futureValue = getFutureValue(presentValue, interestRate, timeSpan);
		System.out.println("YOUR ANTICIPATED FUTURE VALUE IS: $" + futureValue);
	}
		// function that returns the anticipated future value based on an account’s present value, interest rate, and time
		private static double getFutureValue(double presentValue, double interestRate, double timeSpan) {
		System.out.println("FUTURE FUNCTION");
		System.out.println("PRESENT VALUE: " + presentValue);
		// Convert interestRate from percent to decimal
		interestRate = interestRate / 100;
		System.out.println("INTEREST RATE: " + interestRate);
		System.out.println ("TIME " + timeSpan);
		
		// Define the variables
		double futureValue = 0;
		
		// Calculate the future value
		futureValue = presentValue * (1 + (interestRate * timeSpan));
		
		// Add return statement
		return futureValue;
		
	}
}

/*
FV = PV * [1 + (rate x time)
returns the anticipated future value
based on an account’s present value, interest rate, and time. 
formulae for simple future value is FV = PV * [1 + (rate x time
savings
(20000, 4.5, 15)
RESULT:    33500 
*/