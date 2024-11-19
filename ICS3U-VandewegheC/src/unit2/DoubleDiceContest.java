package unit2;

/**
 * Description:
 * Date:
 * @author
 */
public class DoubleDiceContest {

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */

		System.out.println("-------------------------------");

		System.out.println("Your first number is:\n");
		int user1 = (int)((Math.random() * 6) + 1);
		System.out.println(user1);

		System.out.println("\nYour second number is:\n");
		int user2 = (int)((Math.random() * 6) + 1);
		System.out.println(user2);

		int totalUser = user1 + user2;

		System.out.println("\nYou have a total of " + totalUser);

		System.out.println("\n-------------------------------");

		System.out.println("\nThe computers first number is:\n");
		int computer1 = (int)((Math.random() * 6) + 1);
		System.out.println(computer1);

		System.out.println("\nThe computers second number is:\n");
		int computer2 = (int)((Math.random() * 6) + 1);
		System.out.println(computer2);

		int totalComputer = computer1 + computer2;

		System.out.println("\nThe computer has a total of " + totalComputer);

		System.out.println("\n-------------------------------");

		if (totalUser > totalComputer) {
			System.out.println("\nYou win!");
		} else if (totalUser == totalComputer) {
			System.out.println("\nYou and the computer tied!");
		} else { //(totalUser < totalComputer) {
			System.out.println("\nThe computer wins!");
		}
		
		System.out.println("\n-------------------------------");

	}
}


