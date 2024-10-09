package unit1;

import java.util.Scanner;
/**
 * Description: dooo
 * Date: Oct. 8, 2024
 * @author Caden Vandeweghe
 */
public class Carpet {
    /**
	   *
	   * @param args unused
	   */
	  public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);

        // Prompt user for the length of the room in meters
        System.out.println("Enter the length of the room in meters:");
        double length = sc.nextDouble();

        // Prompt user for the width of the room in meters
        System.out.println("Enter the width of the room in meters:");
        double width = sc.nextDouble();

        // Prompt user for the cost of the carpet per square meter
        System.out.println("Enter the cost of the carpet per square meter:");
        double costPerSquareMeter = sc.nextDouble();

        // Calculate the area of the room
        double area = length * width;

        // Calculate the total cost to carpet the room
        double totalCost = area * costPerSquareMeter;

        // Display the final answer
        System.out.println("To carpet a room of " + area + " square meters at a cost of $ "  + costPerSquareMeter + " you would need a total of:");
        System.out.println("$ " + totalCost);
    
  		  sc.close();

  }
}
