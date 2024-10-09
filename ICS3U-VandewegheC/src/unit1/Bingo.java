package unit1;

/**
 * Description: This code prints out a Bingo card and the rules of the game
 * Date: Sept. 26, 2024
 * @author Caden Vandeweghe
 */
public class Bingo {

	public static void main(String[] args) {

		/**
		 * Entry point to the program
		 * @param args unused
		 */

		// Print game introduction and rules
		System.out.println("Bingo Card");

		System.out.println("\n\t1. The caller randomly pulls a numbered bingo ball.");
		System.out.println("\n\t2. The number is placed on the bingo board and called out.");
		System.out.println("\n\t3. Players look for the called number on their bingo card.");
		System.out.println("\n\t4. If the number is located, it is marked off.");
		System.out.println("\n\t5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.");
		System.out.println("\n\t6. The winning player yells BINGO.");


		// Print the Bingo card header
		System.out.printf("\n%15s%15s%15s%15s%15s%n", "B", "I", "N", "G", "O");
		System.out.println("-----------------------------------------------------------------------------------------");

		// Print Bingo card rows
		System.out.printf("%15s%15s%15s%15s%15s%n", "2", "20", "42", "60", "64");
		System.out.printf("%15s%15s%15s%15s%15s%n", "14", "25", "32", "55", "70");
		System.out.printf("%15s%15s%16s%14s%15s%n", "5", "18", "FREE", "53", "67");
		System.out.printf("%15s%15s%15s%15s%15s%n", "12", "16", "31", "46", "75");
		System.out.printf("%15s%15s%15s%15s%15s%n", "10", "22", "39", "59", "71");
	}
}










