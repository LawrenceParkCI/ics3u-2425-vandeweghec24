package unit1;
/**
 * Description: This code outputs the uses of strings and what it can do.
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
	
		String spaces = "	Trim me		";
		String noSpaces = spaces.trim();
		System.out.println(spaces);
		System.out.println(noSpaces);

		String digits = "1234567890"
		System.out.println(digits.indexOf("6") + digits.indexOf("a"));

		System.out.println("Ilovesandwiches".substring(5).length());

		String word1 = "Hello";
		String word2 = word1;
		word1 = word1.substring(1, 2);
		System.out.printlnz(word2);

		String name1 = "Pierre Elliott Trudeau";
		String name2 = name1.substring(0, 6) + name 1.substring(15);
		System.out.println(name2);

		String msg = "I am enjoying this class.";
		
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);

		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = " + letter);
		System.out.println("msg has" + msg.length() + "characters.");

		substring ( num 1, num2)
		substring (num1)
		charAt (num)
		indexOf(letter)
		length()
		trim()
		toUpperCase()
		toLowerCase()
	}

}
