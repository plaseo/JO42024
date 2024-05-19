package IntroToJava;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// Convert a numeric day of the week to to the weekday, first day of the week is Sunday
		// Sun 1 Mon 2 Tue 3 Wed 4 Thur 5 Fri 6 Sat 7
		// Create the scanner
		Scanner in = new Scanner(System.in);
		System.out.print("Enter numeric day of the week: ");
		int weekDayDigit = in.nextInt();
		if (weekDayDigit > 7) {
			System.out.println("Invalid entry");
		}
		else if (weekDayDigit < 1) {
			System.out.println("Invalid entry");
		}
		else if (weekDayDigit == 1) {
			System.out.println("Sunday");
		}
		else if (weekDayDigit == 2) {
			System.out.println("Monday");
		}
		else if (weekDayDigit == 3) {
			System.out.println("Tuesday");
		}
		else if (weekDayDigit == 4) {
			System.out.println("Wednesday");
		}
		else if (weekDayDigit == 5) {
			System.out.println("Thursday");
		}
		else if (weekDayDigit == 6) {
			System.out.println("Friday");
		}
		else if (weekDayDigit == 7) {
			System.out.println("Saturday");
		}
		in.close();
	}
}
