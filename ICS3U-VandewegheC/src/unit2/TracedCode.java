package unit2;

public class TracedCode {
	//https://docs.google.com/document/d/1tyr3w-uZ41t_1gLoM7WAuknAsR_BMnbUu1lAolIc5co/edit?usp=sharing

	/* Copy each of these separately and complete the tracing document for each */

	/**
Name: Mr. Lee
Date: Oct 29, 2021
Description: Tracing through code
	 */
	//public class Main {
	public static void main(String[] args) {
		int num = 0;
		String word = "Que";

		while (num < 15) {
			System.out.println(word);
			num = num + 1;
		}
		word = word + word;
		while (num > 0) {
			System.out.println(word);
			num = num - 1;
		}
	}


	/**
Name: Mr. Lee
Date: Oct 29, 2021
Description: Tracing through code
	 */
	//public class Main2 {
	//public static void main(String[] args) {
	int num = 500; {

		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 3 == 0) {
				num = num + 7;
			} else  {
				num = num + 1;
			}
		}
		System.out.println(num);
	}
}
