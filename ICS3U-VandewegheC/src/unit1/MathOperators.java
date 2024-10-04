package unit1;
/**
 * Description: This code shows math skills which are applied to coding
 * Date: Oct. 1, 2024
 * @author Caden Vandeweghe
 */
public class MathOperators {
	/**
	 *
	 * @param args unused
	 */
	public static void main (String [] args) {
		/*
         Pre: Kind of Math, but not really
         What do you notice is happening?
		 */ It prints out ints and strings but combines them with a + sign

		//      System.out.println("Butter" + "fly");
		// Prints out the word "Butterfly"
		System.out.println("Butter" + "fly");

		//      System.out.println("1 + 2 + 3 + 4 + 5");
		// Prints out "1 + 2 + 3 + 4 + 5"
		System.out.println("1 + 2 + 3 + 4 + 5");
		//      System.out.println(1 + 2 + 3 + 4 + 5);
		// Prints out the sum of "1 + 2 + 3 + 4 + 5"
		System.out.println(1 + 2 + 3 + 4 + 5);
		//      System.out.println(1 + 2 + "3 + 4 + 5");
		// Prints out the sum of "1 + 2" then "3 + 4 + 5", creating a print of "33 + 4 + 5"
		System.out.println(1 + 2 + "3 + 4 + 5");
		//      System.out.println("1 + 2 + 3" + 4 + 5);
		// Prints out "1 + 2 + 3" then 45, creating a print of 1 + 2 + 345
		System.out.println("1 + 2 + 3" + 4 + 5);
		//Why do you think the last two outputs act so differently?
		// I think that them last two outputs act so differently because of how one part is in brackets and the other is not in brackets as before it was either the code was in brackets or not

		//Summary: What are two possible roles of the + operator?
		// It can show add numbers together or it can pull them together so they are side by side

		/*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
		 */

		// + means: Addition
		System.out.println(5+1 + "it adds numbers together");
		// - means: Subtraction
		System.out.println(20-8 + "it subtracts numbers together");
		// * means: Multiplication
	   	System.out.println(4 * 2 + "it multiplies numbers together");
		// / means: Division
		System.out.println(4/1 + "it divides numbers together");



		//Print the following expression: (3 + 2) * 5
		System.out.println ("(3 + 2) * 5");
		//Print the following expression: 3 + 2 * 5
		System.out.println ("3 + 2 * 5");
		//Was this expected? Why or why not? It was no expected as I thought the console would print the answer, not the equation
		/*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit

         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */	System.out.println((45 * 9/5) + 3);
      		System.out.println((900 - 32) + 5/9);

		/*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
		 */	System.out.println(" % finds out the remainder of division");

		//I think % means: The Remainder of a divided equation.

	}
}
