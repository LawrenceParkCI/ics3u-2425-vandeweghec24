package unit1;

/**
 * Description: Casting 2 worksheet
 * Date: Cotober 16, 2024
 * @author Caden Vandeweghe
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);
		//implicit casting
		
		//explicit casting
		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
   		//The code is chosing the variable "myChar" to be "a". It then prints it, and adds one to the ascii value, then outputting that. After, it makes a new variable "char2". You then add one to the value but you cast it into a char changing it to "b"

		//Why do you think this happens? This happens because the ascii value of "a" is 97, You then add one to that with implicit casting

		//Investigate what is ASCII. What is it? It is the number value of each haracter
		//Can you find the number value for 'a'? Does it match with your findings above? The value of "a" is 97. Yes it does match my findings

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it
		char myCharCap = (char)(myChar - 32);
    		System.out.println(myCharCap);

	}
}
