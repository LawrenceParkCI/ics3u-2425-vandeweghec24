package unit1;

import java.text.DecimalFormat;

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



		DecimalFormat money = new DecimalFormat("$#,###,##0.00");


		System.out.println("What would you like to buy? ");
		buy = sc.nextLine();
		System.out.println("How much does it cost? ");
		cost = sc.nextDouble(); 
		System.out.println("How many are you buying? ");
		amount = sc.nextInt();
		System.out.println("Very good.\n");

		String buyTwo;
		double cost2;
		int amount2;

		sc.nextLine();

		System.out.println("What else would you like to buy? ");
		buyTwo = sc.nextLine();
		System.out.println("How much does it cost? ");
		cost2 = sc.nextDouble();
		System.out.println("How many are you buying? ");
		amount2 = sc.nextInt(); 
		System.out.println("Very good.");

		double totalCost = cost * amount;	
		double totalCost2 = cost2 * amount2;	


		System.out.println("\nThis is your receipt:");

		System.out.println("\n\n\t\t Mr. Vandeweghe's Grocery");

		System.out.println("current date and time to do");

		System.out.format("\n%-15s | %-15s | %-15s | %-20s", "Item", "Price", "Quant.", "Total Price");

		System.out.println("\n-----------------------------------------------------------------");
		System.out.format("%-15s | %-15s | %-15s | %-20s", buy, money.format(cost), amount, money.format(totalCost));
		System.out.format("\n%-15s | %-15s | %-15s | %-20s", buyTwo, money.format(cost2), amount2, money.format(totalCost2));
		System.out.println("\n-----------------------------------------------------------------");
		
		double subTotal = cost + cost2;
		System.out.format("\n%45s", "Subtotal: ");
		System.out.format("%-45s" + money.format(subTotal));
		double taxAmount = 0.13;
		double tax = subTotal * taxAmount;
		System.out.format("\n%45s", "Tax: ");
		System.out.format("%-45s"+ money.format(tax));






		sc.close();
	}
}