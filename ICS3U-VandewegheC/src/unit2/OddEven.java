package unit2;

import java.util.Scanner;

/**
 * Description: This code gets the users input and demonstrates if it is odd or even.
 * Date: Nov. 4, 2024
 * @author Caden 
 */

public class OddEven {

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

		//Declare if the given value is odd or even
		if (number % 2 == 0) {
			System.out.println(number + " is an even number.");
		} else {
			System.out.println(number + " is an odd number.");
		}

		//Close the scanner
		sc.close();

	}
}
