package unit2;

import java.util.Scanner;

/**
* Description: IfChallenge work sheet.
* Date: Nov. 10, 2024
* @author Caden Vandeweghe
*/

public class IfChallenge {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		
    System.out.println("What is your favourite number?");

		// Variables
		int number = sc.nextInt();

		// Part 1: Negative Number
		if (number < 0) {
			System.out.println("You need to look on the bright side!");
		}

		// Part 2: Odd Number
		if (number % 2 == 1) {
			System.out.println("That's a bit strange");
		}

		// Part 3: Divisible by 2 and 3
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("You should really consider thinking about 6");
			} else {
			System.out.println("You can keep wholesome");
			}

		// Part 4: Ones Digit Check
			int onesDigit = Math.abs(number) % 10;
		if (onesDigit == 8) {
			System.out.println("I too am full");
			} else if (onesDigit == 9) {
			System.out.println("Canada is a nice country");
			} else {
			System.out.println("Don't count on it");
	


    /*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
    */
    
      }
   }
}
