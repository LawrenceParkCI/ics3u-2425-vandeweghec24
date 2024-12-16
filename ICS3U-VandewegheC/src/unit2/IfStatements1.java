package unit2;
/**
 * Description: IfStatements1 work sheet.
 * Date: Nov. 10, 2024
 * @author Caden Vandeweghe
 */

public class IfStatements1 {
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why? In part one, nothing is printed because 10 is not greater than 30

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why? In part 2, "XQCL" is printed because the first condition is not satisfied therefore the else statement is illustrated.

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why? In part 3, "sykSHY" is printed. This is because the first if statement is not satisfied and the next else if conditions are satisfied/ 

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//In part 4 this is printed out:
		//1
		//KEKW
		//OMEGALUL
		//2
		//KEKW
		//OMEGALUL
		//sykSHY
		//This is printed out because the first part the if statement conditions are met, and in the 
		//second part the first and second if statements the conditions are satisfied

		//What is the difference between the first and second part? The difference is the first part has an if, else if, and else statement. The second part has three if statement which allows more true conditions to be executed and printed

	}
}
