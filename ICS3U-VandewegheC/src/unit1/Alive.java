package unit1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Description: 
 * Date: Oct. 10, 2024
 * @author Caden Vandeweghe
 */
public class Alive {
	/**
	 *
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
		int CurrentDay;

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
		LocalDate CurrentDaye= LocalDate.of(CurrentYear, CurrentMonth, CurrentDate);

		//Exact Calculations
		int daysAlive = ChronoUnit.DAYS.between(BirthDay, CurrentDay);
		
		//Approximate Calculations
		int DaysAlive = ((CurrentYear - BirthYear)* 365) + ((CurrentMonth - BirthMonth)*30) + (CurrentDate - BirthDate);

		int HourSlept = DaysAlive * 8;

		//Output the result
		System.out.println("\nYou have been alive for " + daysAlive + " days.");
		
		System.out.println("\nYou have been alive for " + DaysAlive + " days if there are 30 days in each month and 365 days per year.");
			
		System.out.println("\nYou have slept " + HoursSlept + " hours. if you sleep 8 hours a day");

		sc.close();
		
	}
}
