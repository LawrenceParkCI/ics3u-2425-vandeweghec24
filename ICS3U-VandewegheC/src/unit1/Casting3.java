package unit1;

/**
 * Description: Casting 3 worksheet
 * Date: October 16, 2024
 * @author Caden Vandeweghe
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way?
		// We did not specify that we wanted a mathematical operation to be outputted
		//Demonstrate casting a double value to a String in this way
		//Demonstrate casting a boolean value to a String in this way
		//Demonstrate casting a char value to a String in this way
		System.out.println("1 + 2 + 3" + 4.5 + 5.5);
		System.out.println("1 + 2 + 3" + true + false);
		System.out.println("1 + 2 + 3" + 'a' + 'b');

		System.out.println("Part 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "25";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2"
		 * "23c"
		 * "2 3"
		 * "Lol23"
		 * "-5"
		 */
		//What can you say about how we can use the function, Integer.parseInt()?
		// Only -5 works I think this is because Integer.parseInt() only works in converting integers, while everything other than -5 in the examples has a character that isn't an integer
		double myNum2 = Double.parseDouble(strNum);

		System.out.println(myNum2);

		// What do you think the code to change a String to double would look like?
		//Similarly, test out the code and write down what instructions


		//When do you think it might be necessary to change a string value into an integer value/double value? If we are asking customers about our service through a rating.
	}
}
