import java.util.Scanner;

public class TwoPointOneSeven{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		int numberOne, numberTwo, numberThree;
		int sum, average, product;
		
		System.out.println("Enter the first integer:");
		numberOne = userInput.nextInt();
		
		System.out.println("Enter the second integer:");
		numberTwo = userInput.nextInt();
		
		System.out.println("Enter the third integer:");
		numberThree = userInput.nextInt();
		
		sum = numberOne + numberTwo + numberThree;
		average = sum / 3;
		product = numberOne * numberTwo * numberThree;
		
		System.out.printf("%nSum = %d%nAverage = %d%nProduct = %d%n", sum, average, product);
		
		if(numberTwo > numberOne && numberTwo > numberThree) {
			System.out.printf("%d is the largest", numberTwo);
		} else if(numberThree > numberOne && numberThree > numberTwo) {
			System.out.printf("%d is the largest", numberThree);
		} else {
			System.out.printf("%d is the largest", numberOne);
		}
	}
}
