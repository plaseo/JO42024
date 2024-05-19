package IntroToJava;

import java.text.DecimalFormat;

public class MarathonRaceTime {

	public static void main(String[] args) {
		// define the variables
		int finishInSeconds = 7724;
		double marathonDistance = 26.2;
		
		// perform calculations
		int minutes = finishInSeconds / 60;
		int hours = minutes / 60;
		int secs = finishInSeconds - minutes * 60;
		int mins = minutes - hours * 60;
		System.out.println(hours+"hrs:"+mins+"mins:"+secs+"secs");
		double averagePace = ((double) (minutes)) / marathonDistance;
		// take output for averagePace and round to 3 decimal places
		int decimalPlaces = 3;
        DecimalFormat df = new DecimalFormat("#." + "0".repeat(decimalPlaces)); 
        String roundedNumber = df.format(averagePace);
        System.out.println("Average pace: " + roundedNumber + " minutes per mile");
        
	}

}
