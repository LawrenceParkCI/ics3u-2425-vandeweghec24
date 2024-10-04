package unit1;
/**
 * Description:
 * Date: Oct. 4, 2024
 * @author Caden Vandeweghe
 */
public class PlayingWithStrings {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		String fruit = "apple";
		//fruit = "banana";
		System.out.println(fruit + "split");

		String num1 = "12";
		String num2 = "34";
		System.out.println(num1 + num2);

		//String num1 = "12";
		//String num2 = "34";
		System.out.println(num1 + num2 + 56);

		String number1 = 13 + "";
		System.out.println(number1);
	
		//String fruit = "apple"
		System.out.println(fruit.length());
			
	
		String name = "Runnymede";
		System.out.println(name.length() + "Ravens".length());
		
		String message = "Themouseranuptheclock";
		String word = message.substring(3,8);
		System.out.println(word);
		
		//String message;
		message = "JackandJillwentupthehill";
		System.out.println(message.substring(20));
	
		System.out.println(message.substring(message.length()-4));

		System.out.println("hello".substring(3));
	
		System.out.println("hello".substring(5));

		//System.out.println("hello".substring(6));

		
	}

}