public class Decrypt{		
	public void decryptMessage(String userMessage){
	
		int firstNumber, secondNumber, thirdNumber, fourthNumber, temp;

		temp = Integer.parseInt(userMessage);
		
		secondNumber = temp % 10;
		secondNumber = (secondNumber - 7 + 10) % 10;
		temp /= 10;
		
		firstNumber = temp % 10;
		firstNumber = (firstNumber - 7 + 10) % 10;
		temp /= 10;
		
		fourthNumber = temp % 10;
		fourthNumber = (fourthNumber - 7 + 10) % 10;
		temp /= 10;
		
		thirdNumber = temp;
		thirdNumber = (thirdNumber - 7 + 10) % 10;
		
		String concatMessage = (String) "" + firstNumber + secondNumber + thirdNumber + fourthNumber;
		System.out.println("\nmssg_dcrpt_this: " + concatMessage);
	}
}

		
