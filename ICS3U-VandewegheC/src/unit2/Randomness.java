package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description:Randomness work sheet.
Date: Nov. 18, 2024
@author: Caden Vandeweghe
 */


public class Randomness {
	public static void main(String[] args) {
		//for (int i = 0; i < 10; i++) {
			//System.out.println(Math.random());
		//}

		//Run the program a few times. What do you think is the 
		//range of the numbers generated?
		//0.01 to 0.99999999999999999

		//Read the demo program. Write the code so that the program 
		//will produce a random number between 100 and 1000.
		for (int number = 0; number < 10; number++) {
			System.out.println((Math.random() * 900) + 100);
		} 
	}
}