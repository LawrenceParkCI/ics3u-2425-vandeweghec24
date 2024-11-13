package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author
 */

public class IfChallenge3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String start;
		int points;

		System.out.print("Are you ready for a quiz? (yes or no) ");
		start = sc.nextLine();

		if (start.equalsIgnoreCase("yes")) {
			System.out.println("Write down the number for which answer you choose");

			System.out.println("Q1) What is 23^-3?");
			System.out.println("1) 0.00008218952");
			System.out.println("2) -12167");
			System.out.println("3) None of the above");

			System.out.print("\n> ");
			int number = sc.nextInt();

			if (number == 1) {
				System.out.println("\n" + number + " is correct!");
				points = 1;
			} else {
				System.out.println("\n" + number + " is incorrect.");
			}

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