package unit2;

/**
* Description: BasicBoolean worksheet.
* Date: Nov. 4, 2024
* @author Caden Vandeweghe
*/

public class BasicBoolean {
	
	/**
	 * Entry point to the program
	 * @param args unused
	 */
	
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;

    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because firstNum with value 5 is less then secondNum with value 10 (5 < 10)
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because firstNum with value 5 is less then secondNum with value 10 (5 < 10) but it indicates that firstNum is greater then secondNum which is false
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because ________________
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out true because ________________
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: g
      * < means:
      * <= means:
      * >= means:
      * == means:
      * != means:
    */

  }
}