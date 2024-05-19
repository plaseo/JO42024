package IntroToJava;

public class Numbers {

	public static void main(String[] args) {
		int numA = 5;
		int numB = 6;
		int numberOfElements = 2;
		// Add together to get sum
		int sum = numA + numB;
		// System.out.println(sum);
		
		// Divide by 2
		System.out.println(sum / numberOfElements);
		
		// Solution 1: modify our divisor by a double
		System.out.println(sum / numberOfElements);
		
		// Solution 2: "cast" our number to a double
		// double average = (numA+numB)/2;
		double average = ((double) (numA + numB)) / numberOfElements;
		System.out.println(average);
		
	}

}
