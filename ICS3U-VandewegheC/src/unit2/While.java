package unit2;
import java.util.Scanner;
/**
Description: This program is about while loops
Date: Dec. 1, 2024
@author Caden Vandeweghe
 */
public class While {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		
    Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}

		//Run the code Using the debugger. 
		//Explain the code in your own words
		/*
		 * It prints out Welcome, name ! depending on the amount of people that are being planned to be seen.
		 */

		//What code is repeated?
		/*
		 * "Welcome, " name + "!"
		 */
		//When does it decide whether to repeat or not?
		/*
		 * If there are still people that have to be named.
		 */
		//What is the condition for repeating?
		/*
		 * if numPeople is greater than 0.
		 */

		//What is the difference between a while loop and a do-while loop?
		/*
		 * A do-while loop checks the condition at the end of the loop while a while loop does not.
		 */


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.
		
		String word;
		int counter = 1;
		System.out.print("\nType in a word? ");
		word = in.nextLine();
		while (counter <= 20) {
			System.out.println(word);
			counter += 1;
		}

		in.close();


	}
}
