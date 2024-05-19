package IntroToJava;

public class Functions {

	public static void main(String[] args) {
		// Call the function sayHi
		sayHi();
		
		// Call the printName function
		printName("Tim", "Stephens");
		
		printName("Sarah", "Rogers");
		
		// Call the combineName function
		String fullName = combineName("Tim", "Stephens");
		System.out.println(fullName);
	}
	
	// Defining the function
	public static void sayHi() {
		System.out.println("Hi");
	}
	
	// Define a function that prints your name
	public static void printName(String firstName, String lastName) {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
	
	// Define a function that returns the full name
	public static String combineName(String firstName, String lastName) {
		String combineName = firstName + " " + lastName;
		return combineName;
	}

}
