
package unit2;

import java.util.Scanner;
/**
 * Description: This program determines whether the computer likes one's name.
 * Date: Nov. 30, 2024
 * @author Caden Vandeweghe
 */
public class NameGame {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		Scanner sc = new Scanner(System.in);
		// receiving input
		System.out.println("What is your name?");
		String name = sc.nextLine();
		// printing output
		if (Math.random() >= 0.3) {
			System.out.println("The name " + name + " is my favourite!"); }
		else {
			System.out.println("I hate the name " + name + "!"); }
		sc.close();

	}

}
