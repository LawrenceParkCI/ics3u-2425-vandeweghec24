package unit1;

import java.util.Scanner;

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

				System.out.println("Type in your birth year and <Enter>: ");
				BirthYear = sc.nextInt();

				System.out.println("Type in your birth month and <Enter>: ");
				BirthMonth = sc.nextInt();
				
				System.out.println("Type in your birth date and <Enter>: ");
				BirthDate = sc.nextInt();
				
				System.out.println("Type in the current year and <Enter>: ");
				CurrentYear = sc.nextInt();

				System.out.println("Type in the current month and <Enter>: ");
				CurrentMonth = sc.nextInt();
				
				System.out.println("Type in the current day and <Enter>: ");
				CurrentDay = sc.nextInt();
				
				System.out.println();
								
				int DaysAlive = ((CurrentYear - BirthYear)* 365) + ((CurrentMonth - BirthMonth)*30) + (CurrentDay - BirthDate);

				System.out.println("You have been alive for" );
				
				System.out.println("You have slept" + DaysAlive*8);

				

	}
}