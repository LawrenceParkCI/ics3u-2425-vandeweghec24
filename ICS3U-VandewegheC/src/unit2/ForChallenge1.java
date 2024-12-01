package unit2;
/**
Description: This is a challenge using for loops
Date: Dec. 1, 2024
@author Caden Vandeweghe
*/
public class ForChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
	  for (double i = 0.0; i <= 1; i += 0.1) {
		  System.out.println(i);
	  }
  }
}
