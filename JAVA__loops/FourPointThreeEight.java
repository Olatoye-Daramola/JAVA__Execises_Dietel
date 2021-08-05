//import java.util.Scanner;

public class FourPointThreeEight{

	int firstNumber, secondNumber, thirdNumber, fourthNumber, temp;
	
//	Scanner scan = new Scanner(System.in);
	
//	System.out.println("Enter your message");
//	int userMessage = scan.nextInt();
		
	public void encryptMessage(int userMessage){
	
//		userMessage = message;
		temp = userMessage;

//		temp = message;
		
		fourthNumber = temp % 10;
		fourthNumber = fourthNumber + 7;
		fourthNumber = fourthNumber % 10;
		temp /= 10;
		
		thirdNumber = temp % 10;
		thirdNumber = thirdNumber + 7;
		thirdNumber = thirdNumber % 10;
		temp /= 10;
		
		secondNumber = temp % 10;
		secondNumber = secondNumber + 7;
		secondNumber = secondNumber % 10;
		temp /= 10;
		
		firstNumber = temp;
		firstNumber = firstNumber + 7;
		firstNumber = firstNumber % 10;
		
		String concatMessage = (String) "" + thirdNumber + fourthNumber + firstNumber + secondNumber;
		System.out.println(concatMessage);
	}
}
