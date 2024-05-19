package IntroToJava;

import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		// Convert a numeric grade to a letter grade
		// This throws an exception if you input text but works well with numbers
		// Create the scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter numeric grade: ");
		int numericGrade = in.nextInt();
		if (numericGrade > 100) {
			System.out.println("Invalid entry");
		}
		else if (numericGrade < 0) {
			System.out.println("Invalid entry");
		}
		else if (numericGrade > 89) {
			System.out.println("A");
		}
		else if (numericGrade > 79 ) {
			System.out.println("B");
		}
		else if (numericGrade > 71) {
			System.out.println("C");
		}
		else if (numericGrade > 63) {
			System.out.println("D");
		}
		else if (numericGrade > 0) {
			System.out.println("F");
		}
		// close the scanner
		in.close();
	}

}
