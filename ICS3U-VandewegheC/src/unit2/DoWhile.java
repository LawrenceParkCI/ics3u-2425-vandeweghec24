
package unit2;
import java.util.Scanner;
/**
Description: This program is about do-while loops
Date: Dec. 1, 2024
@author Caden Vandeweghe
 */
public class DoWhile {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		//Run the code. Explain the code in your own words

		//What code is repeated?
		/*
		 * "What is your name?"
		 */
		//When does it decide whether to repeat or not?
		/*
		 * Whether "Mr.Lee" is typed in or not.
		 */
		//What is the condition for repeating?
		/*
		 * If "Mr.Lee" is not typed in.
		 */

		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.

		String word;
		int counter = 1;
		System.out.print("\nType in a word? ");
		word = in.nextLine();
		do {
			System.out.println(word);
			counter += 1;

		} while (counter <= 20);

		System.out.println("PROGRAM COMPLETE");
		in.close();
	}
}
