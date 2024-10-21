package unit1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Description: todo
 * Date: Oct. 18, 2024
 * @author Caden Vandeweghe
 */
public class GroceryShopping {

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Vandeweghe's Grocery\" ========== /// $$$ ||");

		//Declare the variables
		String buy;
		double cost;
		int amount;

		System.out.println("What would you like to buy? ");

		buy = sc.nextLine(); 

		System.out.println("How much does it cost? ");

		cost = sc.nextDouble(); 


		System.out.println("How many are you buying? ");

		amount = sc.nextInt(); 

		System.out.println("Very good.");

		//Declare the variables
		String buy2;
		double cost2;
		int amount2;

		System.out.println("What would you like to buy? ");

		buy2 = sc.nextLine(); 

		System.out.println("How much does it cost? ");

		cost2 = sc.nextDouble(); 

		System.out.println("How many are you buying? ");

		amount2 = sc.nextInt(); 

		System.out.println("Very good.");
	
		
		
		System.out.println("\nThis is your receipt:");
		
		System.out.println("\n\n\t\t Mr. Vandeweghe's Grocery");

		System.out.println("current date and time to do");
		
		System.out.printf("\n%-15s | %-15s | %-15s | %-20s", "Item", "Price", "Quant.", "Total Price");
		
		System.out.println("\n--------------------------------------------------------------------------------");
		
		
		
		
		
		sc.close();
	}
}