package unit3;

import java.util.Scanner;

/**
 * Description:
 * Date: Dec. 17, 2024
 * @author Caden Vandeweghe
 */

public class MathPlus {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	
	}

	//Returns the distance between two points
	
	/**
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static double distance(int x1, int y1, int x2, int y2) {
		
		int dx = x2 - x1;
		int dy = y2 - y1;
		
		double difference = Math.sqrt(dx * dx + dy * dy);
		
		return difference;
		
	}
	
	//Returns the hypotenuse of a triangle given the length of the other two sides
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double hypotenuse (double a, double b) {
		
		double c = Math.sqrt(a * a + b * b);
		
		return c;
		
	
	
	//Returns the number of factors of the given number
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	//public static double numOfFactors (int num) {

	//	for (int i = 1; i < num; i++) {



			
	}
	}
//}

	

