
package unit2;
import java.util.Scanner;
/**
Description: This is a challenge about using string methods and for loops.
Date: Nov. 30, 2024
@author Caden Vandeweghe
 */
public class StringLengthAndChars {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));

		//.length() gets the value 8.
		/*
		 * This is because there are 8 characters in the string "Ms. Kemp"
		 */
		//.charAt(position) gets the value:
		/*
		 * s
		 * .
		 * 
		 */
		/*
		 * This is because s is at index 1, . is at index 2, and " ", is at index 3.
		 */
		//counting starts from index 1 to index 3.

		/**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */

		Scanner sc = new Scanner(System.in);

		// declare variable
		String name2;
		int charAt;

		System.out.print("Type in a name: ");
		name2 = sc.nextLine();
		sc.close();
		for (charAt = 0; charAt < name2.length(); charAt++) {
			System.out.println(name2.charAt(charAt));
		}

	}
}
