package unit1;

import java.util.Scanner;

/**
 * Description: This code lets you type your first and last name as well as a subject
 * Date: Oct. 3, 2024
 * @author Caden Vandeweghe
 */
public class MakeLabels {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String subject;

		String name;

		System.out.println("Type in your name and the subject and press <Enter>");
		name = sc.nextLine();
		subject = sc.nextLine();

		System.out.println();
		System.out.println("*****************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}
}
