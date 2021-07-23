import java.util.Scanner;


public class GuessNumber {
	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		
		int mysteryNumber = 6;
		
		System.out.println("Wimp, enter your guess");
		int userNumber = userInput.nextInt();
		
		if (mysteryNumber == userNumber) {
			System.out.println("Wow, you did well");
			}
			
		if (mysteryNumber > userNumber) {
			System.out.println("Sorry Wimp, you undershot");
			}
		
		if (mysteryNumber < userNumber) {
			System.out.println("Ouch! Wimp, you overshot");
			}

	}
}
