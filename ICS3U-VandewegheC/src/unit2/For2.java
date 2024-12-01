package unit2;
/**
Description: This program is about for loops
Date: Dec. 1, 2024
@author Caden Vandeweghe
*/
public class For2 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    //Recall - create a for loop printing 1 to 10:
	  System.out.println("FOR LOOP PRINTING 1 - 10");
	  for (int j = 1; j <= 10; j++) {
		  System.out.println(j);
	  }
	  System.out.print("\n");

    //though we are repeating a certain number of times, we can use variables in our for loops as well

    int times = 20;

    for (int i = 15; i < times; i++) {
      System.out.println(i);
    }
    System.out.print("\n");
   
    //In addition, the counter doesn't necessarily have to be an integer
    double increment = 0.1;
    for (double i = 0; i < 2; i += increment) {
      System.out.println(i);
    }
    System.out.print("\n");
    //create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
    double l = 0;
    double count = l;
    for (l = 0; l < 5; l = count++) {
    	System.out.println(l);
    }

    

   //Look at the following code. Explain what is happening?

    int sum = 0; // sum is initialized to 0

    for (int i = 1; i < 10; i++) { // int i starts at 1, loops ends when i is greater than 10, and every time i increases by 1.
      sum += i; // the value of i is added to sum every time the loop happens
    }

    System.out.println("\n" + sum); // when the loop ends, the number is printed out.


    
  }
}
