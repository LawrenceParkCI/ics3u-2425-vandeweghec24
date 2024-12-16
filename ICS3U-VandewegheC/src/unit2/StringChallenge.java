package unit2;
import java.util.Scanner;
/**
 * Description: This program gives a challenge about string comparison
 * Date: Nov. 31, 2024
 * @author Caden Vandeweghe
 */
public class StringChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
		 */

		Scanner sc = new Scanner(System.in);

		// Declare variables.
		String s1, s2;

		// Receive input.
		System.out.print("Type in a first name: ");
		s1 = sc.next();
		System.out.print("Type in another first name: ");
		s2 = sc.next();

		// Print output.
		if (s1.compareTo(s2) == 0) {
			System.out.println("You typed in the same name.");
		}
		else {
			System.out.println("They are not the same.");
		}

		// Declaring variables again.
		String s3, s4;

		// Receive input.
		System.out.print("Type in your favourite colour: ");
		s3 = sc.next();
		System.out.print("Type in another colour: ");
		s4 = sc.next();

		// Print output.
		if (s3.equals(s4) == true) {
			System.out.println("You typed in the same colour");
		}
		else if (s3.equalsIgnoreCase(s4)) {
			System.out.println("You typed in the same colour except one of them is in lowercase.");
		}
		else {
			System.out.println("How do you have two favourite colours?");
		}

		// Declaring a variable
		int i1;
		String s6 = "5";

		//Receive input.
		System.out.print("Type in an integer: ");
		i1 = sc.nextInt();

		//Print output:
		System.out.println("The integer you typed in was: " + i1); // implicit casting
		System.out.println("The total of the typed integer and 5 is: " + (i1 + Integer.parseInt(s6))); // explicit casting

		sc.close();
	}




}
