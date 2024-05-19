package IntroToJava;

import java.text.DecimalFormat;

public class ClassroomRatios {

	public static void main(String[] args) {
		// define the variables
		int boysInClass = 11;
		int girlsInClass = 16;
		int teachersInClass = 2;
		
		// perform calculations
		int studentsInClass = boysInClass + girlsInClass;
		double percentOfGirls = ((double) (girlsInClass) / (studentsInClass) * 100);
        // take output for percentOfGirls and round to 3 decimal places
		int decimalPlaces = 3;
        DecimalFormat df = new DecimalFormat("#." + "0".repeat(decimalPlaces)); 
        String roundedNumber = df.format(percentOfGirls); 
        System.out.println(roundedNumber + "% of the class are girls");
        
        double studentTeacherRatio = ((double) (studentsInClass) / (teachersInClass));
		System.out.println("The Student-Teacher ratio is " + studentTeacherRatio);
	}

}
