package unit1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Description: This code creates a grocery shop program that allows you the ability to input any item with the price and quantity of it. This then leads to a receipt that is printed which illustrates the sub total, tax, and total with tax as well as its approximate value and the value rounded to the nearest 5 cent. After that it outputs some kind messages.
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

		// Declare lists to store item details as variables
		List<String> items = new ArrayList<>();
		List<Double> costs = new ArrayList<>();
		List<Integer> quantities = new ArrayList<>();

		// Declare the decimal formats
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat nearestCentFormat = new DecimalFormat("$#,###,##0.05");

		// Print title bar
		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Vandeweghe's Great Groceries\" ========== /// $$$ ||");

		String moreItems;

		do {
			// Ask for item details
			System.out.print("\nWhat would you like to buy? ");
			String buy = sc.nextLine();
			items.add(buy);

			System.out.print("How much does it cost? ");
			double cost = sc.nextDouble();
			costs.add(cost);

			System.out.print("How many are you buying? ");
			int amount = sc.nextInt();
			quantities.add(amount);

			System.out.println("Very good.\n");

			// Clear the newline
			sc.nextLine(); 

			// Ask if they want to buy more items
			System.out.print("Do you want to buy more items? (yes or no) ");
			moreItems = sc.nextLine();

		} while (moreItems.equalsIgnoreCase("yes"));

		// Generate receipt
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String dateTime = formatter.format(new Date());

		System.out.println("\n\n\n============================ YOUR RECEIPT ============================");
		System.out.println("\nMr. Vandeweghe's Great Groceries\n");
		System.out.println(dateTime);
		System.out.println("\n======================================================================");
		System.out.format("%-15s | %-15s | %-15s | %-15s", "Item", "Price", "Quantity", "Total Price");
		System.out.println("\n----------------------------------------------------------------------");

		double subTotal = 0;

		for (int i = 0; i < items.size(); i++) {
			String item = items.get(i);
			double cost = costs.get(i);
			int quantity = quantities.get(i);
			double totalCost = cost * quantity;

			System.out.format("%-15s | %-15s | %-15s | %-15s%n", item, money.format(cost), quantity, money.format(totalCost));
			subTotal += totalCost; // Accumulate subtotal
		}

		System.out.println("----------------------------------------------------------------------");

		// Summary calculations

		// Subtotal
		System.out.format("%54s", "Subtotal: ");
		System.out.format(money.format(subTotal));

		// Tax
		double taxRate = 0.13;
		double tax = subTotal * taxRate;
		System.out.format("\n%54s", "Tax: ");
		System.out.format(money.format(tax));

		// Total
		double total = subTotal + tax;
		System.out.format("\n%54s", "Total: ");
		System.out.format(money.format(total));

		System.out.println("\n======================================================================");

		// The approximate dollar values of the purchase
		System.out.println("\nThis is approximately " + money.format(Math.round(total)) + ".");
		System.out.println("Rounded to the nearest 5 cents: " + nearestCentFormat.format(total) + ".");

		System.out.println("\n======================================================================");

		// Some kind messages
		System.out.println("\nHave a great day!");
		System.out.println("Thank you for shopping at Mr. Vandeweghe's Great Groceries");
		System.out.println("We hope to see you again soon!");

		System.out.println("\n**********************************************************************");

		sc.close();
	}
}


