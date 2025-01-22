package unit3;

import java.util.Scanner;

/**
 * Description: This program is about creating different methods
 * Date: Dec 17, 2024
 * @author Caden Vandeweghe
 */
public class MathPlus {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		// distance method
		double d1 = distance(5, 4, 6, 7);
		System.out.println(d1);

		// hypotenuse method
		double h = hypotenuse(10.0, 5.5);
		System.out.println(h);

		// number of factors method
		int f = numOfFactors(48);
		System.out.println(f);

		// prime number method
		boolean p = isPrime(547);
		System.out.println(p);

		// sum of integers method
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number of integers (SUM OF INTEGERS METHOD)");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the " + n + " integers one by one.");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sum(arr);
		System.out.println(sum);

		// sum of doubles method
		System.out.println("\nEnter the number of doubles (SUM OF DOUBLES METHOD)");
		int m = sc.nextInt();
		double[] arr2 = new double[m];
		System.out.println("Enter the " + m + " doubles one by one.");
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextDouble();
		}
		double sum2 = sum(arr2);
		System.out.println(sum2);

		// min of ints method
		System.out.println("\nEnter the number of integers (MIN OF INTS METHOD)");
		int min = sc.nextInt();
		int[] arr3 = new int[min];
		System.out.println("Enter the " + min + " integers one by one.");
		for (int i = 0; i < min; i++) {
			arr3[i] = sc.nextInt();
		}
		int sum3 = min(arr3);
		System.out.println(sum3);

		// min of doubles method
		System.out.println("\nEnter the number of doubles (MIN OF DOUBLES METHOD)");
		int min2 = sc.nextInt();
		double[] arr4 = new double[min2];
		System.out.println("Enter the " + min2 + " integers one by one.");
		for (int i = 0; i < min2; i++) {
			arr4[i] = sc.nextDouble();
		}
		double sum4 = min(arr4);
		System.out.println(sum4);

		// max of ints method
		System.out.println("\nEnter the number of integers (MAX OF INTS METHOD)");
		int max = sc.nextInt();
		int[] arr5 = new int[max];
		System.out.println("Enter the " + max + " integers one by one.");
		for (int i = 0; i < max; i++) {
			arr5[i] = sc.nextInt();
		}
		int sum5 = max(arr5);
		System.out.println(sum5);

		// max of doubles method
		System.out.println("\nEnter the number of doubles (MAX OF DOUBLES METHOD)");
		int max2 = sc.nextInt();
		double[] arr6 = new double[max2];
		System.out.println("Enter the " + max2 + " doubles one by one.");
		for (int i = 0; i < max2; i++) {
			arr6[i] = sc.nextDouble();
		}
		double sum6 = max(arr6);
		System.out.println(sum6);
		
		// bigDifference of ints method
		System.out.println("\nEnter the number of integers (BIGDIFFERENCE OF INTS METHOD)");
		int bigDiff = sc.nextInt();
		int[] arr7 = new int[bigDiff];
		System.out.println("Enter the " + bigDiff + " integers one by one.");
		for (int i = 0; i < bigDiff; i++) {
			arr7[i] = sc.nextInt();
		}
		int sum7 = bigDifference(arr7);
		System.out.println(sum7);
		
		// bigDifference of doubles method
		System.out.println("\nEnter the number of doubles (BIGDIFFERENCE OF DOUBLES METHOD)");
		int bigDiff2 = sc.nextInt();
		double[] arr8 = new double[bigDiff2];
		System.out.println("Enter the " + bigDiff2 + " integers one by one.");
		for (int i = 0; i < bigDiff2; i++) {
			arr8[i] = sc.nextDouble();
		}
		double sum8 = bigDifference(arr8);
		System.out.println(sum8);
		
		// factors method
		System.out.println("\nEnter a integer (FACTORS METHOD)");
		int[] fact = factors(sc.nextInt());
		for (int i = 0; i < fact.length; i++) {
			System.out.print(fact[i] + ", ");
		}
		
	}

	/**
	 * Description: Finds out the distance between two points
	 * @param x1 => point 1 on x axis
	 * @param y1 => point 1 on y axis
	 * @param x2 => point 2 on x axis
	 * @param y2 => point 2 on y axis
	 * @return => the distance between the two points
	 */
	public static double distance( int x1, int y1, int x2, int y2 )	{
		double answer = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return answer;
	}

	/**
	 * Description: Finds out the length of the hypotenuse of a right triangle.
	 * @param a => value of side A
	 * @param b => value of side B
	 * @return => the value of the hypotenuse
	 */
	public static double hypotenuse( double a, double b ) {
		double answer = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		return answer;
	}

	/**
	 * Description: Finds how many factors a number has.
	 * @param num1 => the value of the number
	 * @return => value of counter
	 */
	public static int numOfFactors( int num1 ) {
		int counter = 1;
		for (int i = 1; i < num1; i++) {
			if ((num1 % i) == 0) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Description: Determines whether a number is prime or not
	 * @param num1 => value of the number
	 * @return => whether the number is prime or not
	 */
	public static boolean isPrime( int num1) {
		int num2 = num1/2;
		for (int i= 2; i < num2; i++) {
			if ((num1 % i) == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Description: Finds the total value of all of the integers in an array
	 * @param num1 =>the amount of numbers in an array
	 * @return => the sum of all of the integers in an array
	 */
	public static int sum( int[] num1 ) {
		int sum = 0;
		for (int i = 0; i < num1.length; i++) {
			sum = sum + num1[i];
		}
		return sum;
	}

	/**
	 * Description: Finds the total value of all of the doubles in an array
	 * @param num1 => the amount of numbers in an array
	 * @return => the sum of all of the doubles in an array
	 */
	public static double sum( double[] num1 ) {
		double sum2 = 0;
		for (int i = 0; i < num1.length; i++) {
			sum2 = sum2 + num1[i];
		}
		return sum2;
	}

	/**
	 * Description: Finds the minimum value of all of the integers in an array
	 * @param x => the amount of integers in an array
	 * @return => the smallest integer in an array
	 */
	public static int min( int[] x ) {
		int min = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
		}
		return x[min];
	}

	/**
	 * Description: Finds the minimum value of all of the double in an array
	 * @param x => the amount of double in an array
	 * @return => the smallest double in an array
	 */
	public static double min( double[] x ) {
		int min = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
		}
		return x[min];
	}

	/**
	 * Description: Finds the maximum value of all of the integers in an array
	 * @param x => the amount of integers in an array
	 * @return => the largest integer in an array
	 */
	public static int max( int[] x ) {
		int max = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[max] < x[i]) {
				max = i;
			}
		}
		return x[max];
	}

	/**
	 * Description: Finds the maximum value of all of the doubles in an array
	 * @param x => the amount of doubles in an array
	 * @return => the largest doubles in an array
	 */
	public static double max( double[] x ) {
		int max = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[max] < x[i]) {
				max = i;
			}
		}
		return x[max];
	}
	
	/**
	 * Description: Finds the difference between the largest integer to the smallest integer in an array
	 * @param x=> the amount of integers in the array
	 * @return => the difference between the largest to the smallest integer in an array
	 */
	public static int bigDifference( int[] x ) {
		int min = 0, max = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
			if (x[max] < x[i]) {
				max = i;
			}
		}
		int diff = (x[max] - x[min]);
		return diff;
	}
	
	/**
	 * Description: Finds the difference between the largest double to the smallest double in an array
	 * @param x=> the amount of doubles in the array
	 * @return => the difference between the largest to the smallest double in an array
	 */
	public static double bigDifference( double[] x ) {
		int min = 0, max = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
			if (x[max] < x[i]) {
				max = i;
			}
		}
		double diff = (x[max] - x[min]);
		return diff;
	}
	
	
	public static int[] factors( int x ) {
		int []arr = new int[numOfFactors(x)];  int counter = 0;
		for (int i = x; i > 0 ; i--) {
			if (x % i == 0) {
				arr[counter] = i;
				counter++;
			}
		}
		return arr;
	}
}
