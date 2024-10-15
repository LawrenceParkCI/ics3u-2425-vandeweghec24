package unit1;

import java.util.Scanner;

/**
 * Description:
 * Date: Oct. 10, 2024
 * @author Caden Vandeweghe
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why? A double in being printed here. inNUm = 10 and doubleNum = intNUm which means that the integer will now be converted to a double, resulting in it being converted to 10.0.
		System.out.println(doubleNum);

		//can you explain what is happening in this code? The code showcases that the variable "doubleNum" = itself + 2.2. doubleNum = 10  because it equals intNum which is 10. The new doubleNum output would be 12.2.
		doubleNum = doubleNum + 2.2;

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why? An integer is being outputed because the variable "doubleNum" is now converted to a integer which means its decimals will be removed. The result of this is 12.
		System.out.println(intNum);

		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double - explicit
      double to int - implicit
      int to long - explicit
      long to int - implicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		 */
		//int int1;
		//double double1;
		//long long1;

		//example
		//int1 = 1;

		//int1 = (int) double1;
		//double1 = int1;
		//int1 = (int) long1;
		//long1 = int1;

		System.out.println("Input an integer <Enter>");

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		//double myNum;

		//Scanner in = new Scanner(System.in);
		System.out.println("Give me decimal number up to the hundredth");
		//code

		System.out.print("Rounding down to the nearest tenth, it is: ");

	}
}