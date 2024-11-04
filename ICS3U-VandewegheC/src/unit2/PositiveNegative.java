package unit2;

import java.util.Scanner;

/**
 * Description: This code gets the users input and then illustrates if it has a positive or negative number as well as if it is divisible by 7.
 * Date: Nov. 4, 2024
 * @author Caden Vandeweghe
 */
public class PositiveNegative {

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		//Declare the variables
		Scanner sc = new Scanner(System.in);
		int number;

		//Get users input
		System.out.print("Input any integer value:");
		number = sc.nextInt();

		//Declare if the given value is positive or negative
		if (number >= 0) {
			System.out.println(number + " has a positive value.");
		} else {
			System.out.println(number + " has a negative value.");
		}

		//Declare if the given value is divisible by 7
		if (number % 7 == 0) {
			System.out.println(number + " is divisible by 7.");
		} else {
			System.out.println(number + " is not divisible by 7.");
		}

		//Close the scanner
		sc.close();

	}
}