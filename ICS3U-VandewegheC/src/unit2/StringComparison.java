package unit2;
import java.util.Scanner;
/**
 * Description: This program teaches the programmer about comparing strings
 * Date: Nov 11, 2024
 * @author Caden Vandeweghe
 */
public class StringComparison {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?

		// I keep getting that it is incorrect even if I type in the correct answer which is Toronto.

		/*
      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
		 */

		// .compareTo()

		String s1 = "Apple";
		String s2 = "Apple";
		String s3 = "Orange";
		String s4 = "apple";

		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s3)); // -14 (s1 < s3)
		System.out.println(s3.compareTo(s1)); // 14 (s3 > s1)

		//What values does compareTo() return? How can we 
		//interpret the value?

		/*
		 * It returns a 0, a positive, and a negative value.
		 * If it is 0, then both strings are equal.
		 * If it is a positive number, then the first string has a greater total ASCII value than the second string.
		 * If the result is a negative number, the the first string has a lesser total ASCII value than the second string.
		 */

		// .equals() and .equalsIgnoreCase()

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equals(s4)); // false
		System.out.println(s1.equalsIgnoreCase(s4)); // true

		//what value does equals() and equalsIgnoreCase() return? 

		// true or false

		//What is the difference between these two functions?

		/*
		 * .equals is case sensitive while .equalsIgnoreCase is not.
		 */

		in.close();
	}
}
