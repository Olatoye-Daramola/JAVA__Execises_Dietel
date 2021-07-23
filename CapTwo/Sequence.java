import java.util.Scanner;

public class Sequence{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		int numberOne, numberTwo, numberThree, nthNumber, difference, nthTerm;
		
		System.out.println("Enter the first number");
		numberOne = userInput.nextInt();
		
		System.out.println("Enter the second number");
		numberTwo = userInput.nextInt();
		
		System.out.println("Enter the third number");
		numberThree = userInput.nextInt();
		
		System.out.println("Enter nth term");
		nthTerm = userInput.nextInt();
		
		
		difference = numberTwo - numberOne;
		nthNumber = numberOne + ((nthTerm - 1) * difference);
		
		System.out.printf("%d, %d, %d, ..., %d%n", numberOne, numberTwo, numberThree, nthNumber);
	}
}
