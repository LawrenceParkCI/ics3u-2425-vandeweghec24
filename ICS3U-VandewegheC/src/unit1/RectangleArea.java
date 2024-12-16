package unit1;
import java.util.Scanner;

/**
 * Description: This code lets you type your first and last name as well as a subject
 * Date: Oct. 3, 2024
 * @author Caden Vandeweghe
 */
public class RectangleArea {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//declare variables
		int length, width, depth;

		//get the user input
		System.out.println("VOLUME PROGRAM");
		System.out.println("Type in the length of the rectange and <Enter>: ");
		length = sc.nextInt();

		System.out.println("Type in the width of the cube and <Enter>: ");
		width = sc.nextInt();

		System.out.println("Type in the depth of the cube and <Enter>: ");
		depth = sc.nextInt();

		// calculate the area
		int volume = length * width * depth;

		//print the output
		System.out.println("The volume of your cube is" + volume);
		sc.close();
	}

}
