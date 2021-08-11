public class Encrypt{	
	public void encryptMessage(String userMessage){
	
		int firstNumber, secondNumber, thirdNumber, fourthNumber, temp;
	
		temp = Integer.parseInt(userMessage);
		
		fourthNumber = temp % 10;
		fourthNumber = (fourthNumber + 7) % 10;
		temp /= 10;
		
		thirdNumber = temp % 10;
		thirdNumber = (thirdNumber + 7) % 10;
		temp /= 10;
		
		secondNumber = temp % 10;
		secondNumber = (secondNumber + 7) % 10;
		temp /= 10;
		
		firstNumber = temp;
		firstNumber = (firstNumber + 7) % 10;
		
		String concatMessage = (String) "" + thirdNumber + fourthNumber + firstNumber + secondNumber;
		System.out.println("\nmssg_ecrpt_this: " + concatMessage);
	}
}
