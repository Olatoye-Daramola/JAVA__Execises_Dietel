import java.util.Scanner;

public class TwoPointTwoSix{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first integer");
		int numberOne = userInput.nextInt();
		
		System.out.println("Enter the second integer");
		int numberTwo = userInput.nextInt();

		if((numberTwo % numberOne) == 0){
			System.out.printf("The first integer(%d) is a multiple of the second integer(%d)%n", numberOne, numberTwo);
		}
					
		if((numberTwo % numberOne) != 0){
			System.out.printf("The first integer(%d) is not a multiple of the second integer(%d)%n", numberOne, numberTwo);
		}
	}
}
