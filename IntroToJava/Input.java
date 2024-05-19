package IntroToJava;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// Create the scanner
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to enter information
		System.out.print("Enter your name: ");
		String name = in.next();
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		// Print back to the console
		System.out.println("Hi " + name + ". You are " + age + " years old.");

		//close the scanner
		in.close();
	}

}
