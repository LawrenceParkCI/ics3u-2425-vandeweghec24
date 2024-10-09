package unit1;

import java.util.Scanner;
/**
 * Description:
 * Date: Oct. 8, 2024
 * @author Caden Vandeweghe
 */
public class Alive {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Declare the variables
		String newSentence;

    // Ask the user to input a sentence
		System.out.println("Please enter a sentence:");
    newSentence = sc.nextLine();      

		// Output the String as is
		System.out.println("\nThe sentence as is: " + newSentence);

		// Output the String in all uppercase letters
		System.out.println("\nThe sentence in uppercase: " + newSentence.toUpperCase());

		// Output the String in all lowercase letters
		System.out.println("\nThe sentence in lowercase: " + newSentence.toLowerCase());

		// Output the length of the String
		System.out.println("\nThe length of the sentence: " + newSentence.length());

		// Output the character at index 5
		if (newSentence.length() > 5) {
			System.out.println("\nThe character at index 5: " + newSentence.charAt(5));
		} else {
			System.out.println("\nThe sentence is too short to have a character at index 5.");
		}

		// Declare the variables and output the first word of the String
		int firstWord = newSentence.indexOf(" ");
		System.out.println("\nThe first word of your sentence is: " + newSentence.substring(0,firstWord));

		//Declare the variables and output the last word of the String
		int lastWord = newSentence.lastIndexOf(" ");
		System.out.println("\nThe last word of your sentence is: " + newSentence.substring(lastWord));

	}

}

