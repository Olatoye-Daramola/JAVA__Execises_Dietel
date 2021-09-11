import java.util.Random;
import java.util.Scanner;


public class ComputerGuessNumber {
	public static void main(String[] args) {
		
		Random computerInput = new Random();
		Scanner userInput = new Scanner(System.in);
		
		int computerNumber = computerInput.nextInt(11);
		
		System.out.println("Wimp, enter your guess");
		int userNumber = userInput.nextInt();
		
		if (computerNumber == userNumber) {
			System.out.println("Wow, you did well");
			}
			
		if (computerNumber > userNumber) {
			System.out.println("Sorry Wimp, you undershot");
			}
		
		if (computerNumber < userNumber) {
			System.out.println("Ouch! Wimp, you overshot");
			}

	}
}
