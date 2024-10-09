package unit1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Description: This code presents to you how many days you have approximately and exactly been alive for as well as how many approximate and exact hours you have slept, assuming you sleep 8 hours a night.
 * Date: Oct. 8, 2024
 * @author Caden Vandeweghe
 */
public class Alive {

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//declare the variables
		int BirthYear;
		int BirthMonth;
		int BirthDate;
		int CurrentYear;
		int CurrentMonth;
		int CurrentDate;

		//Input for brith date questions
		System.out.println("Enter your birthdate in numerical values:");

		System.out.println("\nType in your birth year and <Enter>: ");
		BirthYear = sc.nextInt();

		System.out.println("\nType in your birth month and <Enter>: ");
		BirthMonth = sc.nextInt();

		System.out.println("\nType in your birth date and <Enter>: ");
		BirthDate = sc.nextInt();

		//Input for current date questions
		System.out.println("\nEnter the current date in numerical values:");

		System.out.println("\nType in the current year and <Enter>: ");
		CurrentYear = sc.nextInt();

		System.out.println("\nType in the current month and <Enter>: ");
		CurrentMonth = sc.nextInt();

		System.out.println("\nType in the current date and <Enter>: ");
		CurrentDate = sc.nextInt();

		//Acurate calculations using LocalDate
		LocalDate BirthDay = LocalDate.of(BirthYear, BirthMonth, BirthDate);
		LocalDate CurrentDay= LocalDate.of(CurrentYear, CurrentMonth, CurrentDate);

		//Exact Calculations
		long daysAlive = ChronoUnit.DAYS.between(BirthDay, CurrentDay);

		long hoursSlept = daysAlive * 8;

		//Approximate Calculations
		long DaysAlive = ((CurrentYear - BirthYear)* 365) + ((CurrentMonth - BirthMonth)*30) + (CurrentDate - BirthDate);

		long HoursSlept = DaysAlive * 8;

		//Output the result
		System.out.println("\nYou have been alive for exactly" + daysAlive + " days.");

		System.out.println("\nYou have been alive for approximately" + DaysAlive + " days if there are 30 days in each month and 365 days per year.");

		System.out.println("\nYou have slept exactly" + hoursSlept + " hours. if you sleep 8 hours a day");

		System.out.println("\nYou have slept approximately" + HoursSlept + " hours. if you sleep 8 hours a day");

		sc.close();

	}
}
