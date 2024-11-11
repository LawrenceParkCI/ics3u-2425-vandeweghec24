package unit2;

import java.util.Scanner;

/**
 * Description: IfChallenge2 work sheet.
 * Date: Nov. 10, 2024
 * @author Caden Vandeweghe
*/

public class IfChallenge2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    
    System.out.print("Enter the third number: ");
    int num3 = sc.nextInt();

    // Check if the numbers are in strictly increasing order
    if (num1 < num2 && num2 < num3) {
      System.out.println("The numbers are in increasing order!");
    } else {
      System.out.println("The numbers are NOT in increasing order!");
    }

    scanner.close();
    
    //This is for the portfolio

    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
  }
}
