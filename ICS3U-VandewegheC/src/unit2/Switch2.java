package unit2;

/**
Description: Switch 2 work sheet.
Date: Dec. 1, 2024
@author Caden Vandeweghe
 */

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		/*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
		 */

		//Can you create it such that you can remove some breaks?
		System.out.println("Enter a month (e.g., January, February):");
		Scanner in = new Scanner(System.in);

		String month = in.nextLine().trim().toLowerCase();

		System.out.println("Enter a year:");
		int year = in.nextInt();

		switch (month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			System.out.println("31 days");
			break;

		case "april":
		case "june":
		case "september":
		case "november":
			System.out.println("30 days");
			break;

		case "february":
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println("29 days");
			} else {
				System.out.println("28 days");
			}
			break;

		default:
			System.out.println("Invalid month entered.");
			break;
		}
	}
}
