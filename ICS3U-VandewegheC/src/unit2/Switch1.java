
package unit2;
import java.util.Scanner;
/**
Description: This program teaches the programmer about the Switch command
Date: Nov. 31, 2024
@author Caden Vandeweghe
 */
public class Switch1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What number day is it?");
		int day = in.nextInt();

		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("We don't have that day yet");
			break;
		}

		//Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
		//What do you think default means?
		/*
		 * I think default is the equivalent of else for the switch code.
		 */
		//What do you think break means? What happens when you remove a break?
		/*
		 * I think the break is the equivalent of a closed curly brace. If I remove a break, it continues with the code below it.
		 */

		//Create another program, this time asking what day it is (String), and printing out how many days until the weekend

		System.out.println("What day is it? (e.g., Sunday, Monday, etc.)");
		String day2 = in.nextLine().trim().toLowerCase();

		int daysUntilWeekend;

		switch (day2) {
		case "sunday":
			daysUntilWeekend = 6;
			break;
		case "monday":
			daysUntilWeekend = 5;
			break;
		case "tuesday":
			daysUntilWeekend = 4;
			break;
		case "wednesday":
			daysUntilWeekend = 3;
			break;
		case "thursday":
			daysUntilWeekend = 2;
			break;
		case "friday":
			daysUntilWeekend = 1;
			break;
		case "saturday":
			daysUntilWeekend = 0;
			break;
		default:
			System.out.println("Invalid day entered. Please try again.");
			return; // Exit the program
		}

		if (daysUntilWeekend == 0) {
			System.out.println("It's already the weekend! Enjoy!");
		} else {
			System.out.println("There are " + daysUntilWeekend + " days until the weekend.");
		}
	}
}


