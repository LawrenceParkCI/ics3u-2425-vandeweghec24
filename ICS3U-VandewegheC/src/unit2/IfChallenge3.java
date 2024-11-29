package unit2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Description: This program is a interactive Unit 4 Functions quiz.
 * Date: Nov. 22, 2024
 * @author Caden Vandeweghe
 */

public class IfChallenge3 {

	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) throws InterruptedException {

		//Declare the variables
		Scanner sc = new Scanner(System.in);

		final short numberOfQuestions = 5;
		boolean start = false;
		byte score = 0;
		int userAnswerInt;
		char userAnswerChar;

		//Statement asking if the user is prepared (yes or no response)
		System.out.print("Are you ready for a Unit 4 Functions Quiz? (yes or no) ");
		String userStart = sc.nextLine().trim().toLowerCase();

		//If the user responds with yes
		if (userStart.equalsIgnoreCase("yes")) {
			start = true;

			//If the user responds with no	
		} else if (userStart.equals("no")) {
			start = false;
			System.out.println("Ok, come back when you are.");

			//If the user responds with anything other than yes or no
		} else {
			System.out.println("Invalid response.");
		}

		//Start of quiz, only if user responds with yes
		if (start) {
			Thread.sleep(600);
			System.out.println("\nWelcome to the Unit 4 Functions Quiz!");
			Thread.sleep(600);
			System.out.print("\nPlease enter your name: ");
			String name = sc.nextLine();
			Thread.sleep(600);
			System.out.println("\nHi " + name + "! Let's start the quiz.\n");
			Thread.sleep(600);
			System.out.println("\nGood luck, you may now start!\n");
			Thread.sleep(600);

			System.out.println("======================================");



			// Question 1
			Thread.sleep(600);
			System.out.println("\nQ1");
			Thread.sleep(1000);
			System.out.print("What is 23^-3?");
			Thread.sleep(1000);
			System.out.println("\n1) 0.00008218952");
			Thread.sleep(600);
			System.out.println("2) -12167");
			Thread.sleep(600);
			System.out.println("3) None of the above");
			Thread.sleep(600);
			System.out.print("\n> ");

			String question1 = sc.nextLine().trim().toLowerCase();

			//If the user inputs the correct answer
			if (question1.equals("1") || question1.equals("0.00008218952")) {
				Thread.sleep(1000);
				System.out.println("\n" + question1 + " is correct!");
				Thread.sleep(600);
				System.out.println("\nGood Job!");
				score++;

				//If the user inputs the incorrect answer
			} else {
				Thread.sleep(1000);
				System.out.println("\n" + question1 + " is incorrect.");
				Thread.sleep(600);
				System.out.println("\nThe correct answer is 1) 0.00008218952");

			}

			// Question 2
			Thread.sleep(600);
			System.out.println("\nQ2");
			Thread.sleep(1000);
			System.out.println("What is 2^6 = 2^(2x+4)?");
			Thread.sleep(1000);
			System.out.println("1) x = 20");
			Thread.sleep(600);
			System.out.println("2) x = 6(2x + 4)");
			Thread.sleep(600);
			System.out.println("3) x = 1");
			Thread.sleep(600);
			System.out.print("\n> ");

			String question2 = sc.nextLine().trim().toLowerCase();

			//If the user inputs the correct answer
			if (question2.equals("3") || question2.equals("1") || question2.equals("x = 1") || question2.equals("x=1")) {
				Thread.sleep(1000);
				System.out.println("\n" + question2 + " is correct!");
				Thread.sleep(600);
				System.out.println("\nGood Job!");
				score++;

				//If the user inputs the incorrect answer
			} else {
				Thread.sleep(1000);
				System.out.println("\n" + question2 + " is incorrect.");
				Thread.sleep(600);
				System.out.println("\nThe correct answer is 3) x = 1");
			}

			// Question 3
			Thread.sleep(600);
			System.out.println("\nQ3");
			Thread.sleep(1000);
			System.out.println("What is the derivative of x^2?");
			Thread.sleep(1000);
			System.out.println("1) 2x");
			Thread.sleep(600);
			System.out.println("2) x^2");
			Thread.sleep(600);
			System.out.println("3) 1");
			Thread.sleep(600);
			System.out.print("\n> ");

			String question3 = sc.nextLine().trim().toLowerCase();

			//If the user inputs the correct answer
			if (question3.equals("1") || question3.equals("2x")) {
				Thread.sleep(1000);
				System.out.println("\n" + question3 + " is correct!");
				Thread.sleep(600);
				System.out.println("\nGood Job!");
				score++;

				//If the user inputs the incorrect answer
			} else {
				Thread.sleep(1000);
				System.out.println("\n" + question3 + " is incorrect.");
				Thread.sleep(600);
				System.out.println("\nThe correct answer is 1) 2x");
			}

			// Question 4 (True/False)
			System.out.println("\nQ4");
			Thread.sleep(1000);
			System.out.println("True or False: The function f(x) = 1/x is defined for x = 0.");
			Thread.sleep(600);
			System.out.println("1) T");
			Thread.sleep(600);
			System.out.println("2) F");
			Thread.sleep(1000);
			System.out.print("\n> ");

			userAnswerChar = sc.nextLine().trim().toUpperCase().charAt(0);

			//If the user inputs the correct answer
			if (userAnswerChar == '1' || userAnswerChar == 'f') {
				Thread.sleep(1000);
				System.out.println("\n" + userAnswerChar + " is correct!");
				Thread.sleep(600);
				System.out.println("\nGood Job!");
				score++;

				//If the user inputs the incorrect answer
			} else {
				Thread.sleep(1000);
				System.out.println("\n" + userAnswerChar + " is incorrect.");
				Thread.sleep(600);
				System.out.println("\nThe correct answer is False.");
			}

			// Question 5
			System.out.println("\nQ5");
			Thread.sleep(1000);
			System.out.println("What is 1^-1");
			Thread.sleep(1000);
			System.out.println("1) 1");
			Thread.sleep(600);
			System.out.println("2) 1000023646478282738732.232347");
			Thread.sleep(600);
			System.out.println("3) None of the above");
			Thread.sleep(600);
			System.out.print("\n> ");

			userAnswerInt = Integer.parseInt(sc.nextLine().trim());

			//If the user inputs the correct answer
			if (userAnswerInt == 1) {
				Thread.sleep(1000);
				System.out.println("\n" + userAnswerInt + " is correct!");
				Thread.sleep(600);
				System.out.println("\nGood Job!");
				score++;

				//If the user inputs the incorrect answer
			} else {
				Thread.sleep(1000);
				System.out.println("\n" + userAnswerInt + " is incorrect.");
				Thread.sleep(600);
				System.out.println("\nThe correct answer is 2) (3/2)x^2 + C");
			}

			// Final Score
			double percent = (double) score / numberOfQuestions * 100;
			Thread.sleep(1000);
			System.out.println("\nYou obtained a mark of " + score + "/5 " + "(" + Math.round(percent) + "%. Good Job!" + ")" );

			// Grading system
			String mark;

			//For A+
			if (percent == 100) {
				mark = "A+";
				Thread.sleep(1000);
				System.out.println("Grade: A+ (Outstanding Performance!)");
				//For A
			} else if (percent >= 90) {
				mark = "A";
				Thread.sleep(1000);
				System.out.println("Grade: A (Excellent!)");
				//For B+
			} else if (percent >= 80) {
				mark = "B+";
				Thread.sleep(1000);
				System.out.println("Grade: B+ (Great Job!)");

				//For B
			} else if (percent >= 70) {
				mark = "B";
				Thread.sleep(1000);
				System.out.println("Grade: B (Good Effort!)");

				//For C
			} else if (percent >= 60) {
				mark = "C";
				Thread.sleep(1000);
				System.out.println("Grade: C (Needs Improvement)");

				//For F+
			} else {
				mark = "F";
				Thread.sleep(1000);
				System.out.println("Grade: F (Better luck next time!)");
			}

			//Date and Time formatters
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			String dateTime = formatter.format(new Date());

			//Test Summary
			System.out.println("\n============ Test Summary ============");
			Thread.sleep(1000);
			System.out.println("Name: " + name);
			System.out.println("Date and Time: " + dateTime);
			System.out.println("Score: " + Math.round(percent) + "%");
			System.out.println("\n" + mark);

			//Close the scanner
			sc.close();
		}

	}

}

