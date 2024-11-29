package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Run the following program with a cost of 10.00.
		//What value is displayed in the output? 11.3

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		System.out.println("The cost of your item with tax is " + money.format(total));


		//Change the above print statement on line 23 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why? The new output displayed is 11.30. It is different this time because it adds a extra decimal place which is more accurate then one when relating to money. It is now like this because it is now formatted into the given decimal format which has two decimal places.


		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different? The new output displayed is $11.30. It is different as it now has a dollar sign at the front, making the output more accurate.

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different? The new output displayed is $11.3, it is different this time as it removed a decimal place

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening? The new display is $11.87 which indicates how the number was rounded to the nearest hundredth which creates a value of money due to the amount of decimal places

		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed? $139505.28


		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening. It now displays $139,505.28 which is different because it now has commas, creating a more accurate result



		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE? 0.13
		//System.out.println("The tax rate is " + TAX_RATE.format);

		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?


		sc.close();
	}

}
