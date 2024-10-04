package unit1;
import java.util.Scanner;

/**
 * Description: This code lets you input 3 letters which it then converts to its ASCII values or the three letters combined, depending on the code.
 * Date: Oct. 4, 2024
 * @author Caden Vandeweghe
 */
public class InputChars {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch1, ch2, ch3;
		System.out.println("Type in any three characters on the keboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		System.out.println("Together these 3 letters spell:" + (ch1 + ch2 + ch3));

		sc.close();

	}

}