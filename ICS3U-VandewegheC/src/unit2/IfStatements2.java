package unit2;
import java.util.Scanner;
/**
* Description: This program teaches the programmer about if statements
* Date: Nov. 5, 2024
* @author Caden Vandeweghe
*/
public class IfStatements2 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your age?");
    int userAge = sc.nextInt();
    /*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
    */
    //Looking at the logic above, why do you think the 
    //program won't work? 

    // because an error will occur if the age is under 18 due to string title only happening if over 18.
    
    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.

    if (userAge > 18) { //If they're over 18, they are titled an adult
        String title = "Adult";
        System.out.println(title);
      } else {  //if they're not over 18, I don't want a title
        System.out.println("Sorry, not quite yet.");
      }
    sc.close();
  }
}
