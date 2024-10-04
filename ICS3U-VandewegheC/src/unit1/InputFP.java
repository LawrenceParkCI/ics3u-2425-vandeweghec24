package unit1;
import java.util.Scanner;

/**
 * Description: This code lets you input two different decimal values.
 * Date: Oct. 3, 2024
 * @author Caden Vandeweghe
 */
public class InputFP {
	/**
	 *
	 * @param args unused
	 */
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);

		//declare variables
		double num1, num2;

		//get the user input
		System.out.println("Type in a decimal and <Enter>: ");
		num1 = sc.nextDouble();

		System.out.println("Type in another decimal and <Enter>: ");
		num2 = sc.nextDouble();

		System.out.println();

		//display the output
		System.out.println("The first number entered was" + num1);	
		System.out.println("The first number entered was" + num2);	

		sc.close();

	}

}