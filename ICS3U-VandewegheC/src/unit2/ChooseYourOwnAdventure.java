package unit2;
import java.util.Scanner;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean start = false;
			
		//Introduction to the game "The Lost Jungle"
		Thread.sleep(500);
		System.out.println("Welcome to The Lost Jungle");
		Thread.sleep(500);

		//Asking user if they want to start
		System.out.println("\nDo you wish to proceed...");
Thread.sleep(250);
System.out.println("\nYes or No");
String userStart = sc.nextLine().trim().toLowerCase();

//If the user responds with yes
if (userStart.equalsIgnoreCase("yes")) {
	start = true;

	//If the user responds with no	
} else if (userStart.equals("no")) {
	start = false;
	System.out.println("Ok, come back when you are.");

	//If the user responds with anything other than yes or no
} else {
	System.out.println("Invalid response, yes or no.");
}
	
do {
//code here
	
	
} while (start = true);
	
		
		
		
		
		
		
		
		sc.close();
		
	}

}
