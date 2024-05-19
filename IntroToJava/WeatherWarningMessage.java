package IntroToJava;

public class WeatherWarningMessage {

	public static void main(String[] args) {
		// Convert the temperature from C to F
		// F = (C x 9/5) + 32
		double degreesC = 25;
		double degreesF = (degreesC * 9/5) + 32;
		
		// Print the temperature in F
		System.out.println(degreesF + "F");
		
		// Test the temperature to print additional warning message
		// Less than 32 >> "FREEZING"
		// Above 105 >> "HEAT"
		if (degreesF < 32) {
			System.out.println("WARNING: FREEZING TEMPERATURES");
		}
		else if (degreesF > 105) {
			System.out.println("WARNING: HEAT ADVISORY");
		}
		else {
			System.out.println("Weather should be pleasant");
		}
	}

}