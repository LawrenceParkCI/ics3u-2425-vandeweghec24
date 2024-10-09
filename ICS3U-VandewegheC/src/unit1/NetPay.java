package unit1;
/**
 * Description: This code displayed the net pay for an employee who works 40 hours at 5.00 per hour and has 2.00 deducted for insurance and must pay 22% for tax
 * Date: Oct. 7, 2024
 * @author Caden Vandeweghe
 */
public class NetPay {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {

		//declare variables
		double hours = 40.00;

		double wage = 5.00;

		double insurance = 2.00;

		double tax = 0.22;

		//netPay equation
		double grossPay = hours * wage;
		double netPay = (grossPay - insurance) - tax*(grossPay - insurance);

		//display the answers
		System.out.println("The gross pay for an employee who works 40 hours at $5.00 per hour before insurance and tax is:");
		System.out.println("$"grossPay);
		System.out.println("\nThe net pay for an employee who works 40 hours at $5.00 per hour and has $2.00 deducted for insurance and must pay 22% for tax is:");
		System.out.println("$"netPay);

	}
}
