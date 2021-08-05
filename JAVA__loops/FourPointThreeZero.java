import java.util.Scanner;

public class FourPointThreeZero{
	public static void main(String[] args){
		int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your 5-digits number");
		int userInput = scan.nextInt();
		
		boolean firstCondition = (userInput > 9999 && userInput <= 99999);
		
		while(!firstCondition) {
			System.out.println("Fucking enter 5-digits number, bitch!");
			userInput = scan.nextInt();
			}

			int temp = userInput;
			
			fifthNumber = temp % 10;
			temp /= 10;
			
			fourthNumber = temp % 10;
			temp /= 10;
			
			thirdNumber = temp % 10;
			temp /= 10;
			
			secondNumber = temp % 10;
			temp /= 10;
			
			firstNumber = temp;
		
		boolean secondCondition = (fifthNumber == firstNumber && fourthNumber == secondNumber);
		
		if(secondCondition){
			System.out.printf("Your number, %d, is a Palindrome%n", userInput);
		} else {
			System.out.printf("Your number, %d, is not a Palindrome%n", userInput);
		}
	}
}
