package unit2;
import java.util.Scanner;
/**
Description: This is the first loop challenge.
Date: Nov. 25, 2024
@author Caden Vandeweghe
 */
public class LoopChallenge1 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */
		// declare variables
		String password;
		int attempts = 1;
		boolean correctPass = false;

		// receive input
		do {
			attempts ++;
			System.out.print("Print a password here: ");
			password = sc.next();

			if (password.equalsIgnoreCase("computers") && attempts <= 3) {
				correctPass = true;
				System.out.println("This is the correct password, Welcome to the club!"); }
			else {
				System.out.println("Incorrect password, try again."); }
		} while (correctPass == false && attempts <= 3);

		if (attempts > 3) {
			System.out.println("You are not welcome...");
		}

		sc.close();


	}
}
