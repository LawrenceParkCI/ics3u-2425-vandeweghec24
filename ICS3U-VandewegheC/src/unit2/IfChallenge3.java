package unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author
 */

public class IfChallenge3 {
	public static void main(String[] args) {

		//Declare the variables
		Scanner sc = new Scanner (System.in);

		String start;
		int points = 0;

		//Statement asking if the user is prepared (yes or no response)
		System.out.print("Are you ready for a Unit 4 Functions quiz? (yes or no) ");
		start = sc.nextLine();

		//If user responds with yes
		if (start.equalsIgnoreCase("yes")) {
			System.out.println("\nWrite down the number for which answer you choose");

			//Question 1
			System.out.println("\nQ1) What is 23^-3?");
			System.out.println("1) 0.00008218952");
			System.out.println("2) -12167");
			System.out.println("3) None of the above");

			System.out.print("\n> ");
			int question = sc.nextInt();

			//Question 1 answer
			if (question == 1) {
				System.out.println("\n" + question + " is correct!");
				points = points + 1;
			} else {
				System.out.println("\n" + question + " is incorrect.");
			}

			//Question 2
			System.out.println("\nQ2) What is 2^6 = 2^2x+4?");
			System.out.println("1) x = 20");
			System.out.println("2) x = 6(2x + 4)");
			System.out.println("3) x = 1");

			System.out.print("\n> ");
			int question2 = sc.nextInt();

			//Question 2 answer
			if (question2 == 3) {
				System.out.println("\n" + question2 + " is correct!");
				points = points + 1;
			} else {
				System.out.println("\n" + question2 + " is incorrect.");
			}
			double percent = (points / 2) * 100;

			DecimalFormat percentage = new DecimalFormat("00.00");

			System.out.println("You obtained a mark of " + percentage.format(percent));

			//If user responds with anything other than yes
		} else {
			System.out.println("Ok, come back when you are.");
		}

		//This is for the portfolio

		/*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
		 */
	}
}