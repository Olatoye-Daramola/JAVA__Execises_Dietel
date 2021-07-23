import java.util.Scanner;

public class TwoPointTwoFour{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		int numberOne, numberTwo, numberThree, numberFour, numberFive;
		
		System.out.println("Enter the first number");
		numberOne = userInput.nextInt();
	
		System.out.println("Enter the second number");
		numberTwo = userInput.nextInt();	
	
		System.out.println("Enter the third number");
		numberThree = userInput.nextInt();	
	
		System.out.println("Enter the fourth number");
		numberFour = userInput.nextInt();	
	
		System.out.println("Enter the five number");
		numberFive = userInput.nextInt();	
	
		
		int smallest = numberOne;
		
		if(numberTwo < smallest){
			smallest = numberTwo;
		}
		
		if(numberThree < smallest){
			smallest = numberThree;
		}	
	
		if(numberFour < smallest){
			smallest = numberFour;
		}	

		if(numberFive < smallest){
			smallest = numberFive;
		}
		
		System.out.printf("The smallest number is: %d%n", smallest);


		int largest = numberOne;
		
		if(numberTwo > largest){
			largest = numberTwo;
		}
		
		if(numberThree > largest){
			largest = numberThree;
		}	
	
		if(numberFour > largest){
			largest = numberFour;
		}	

		if(numberFive > largest){
			largest = numberFive;
		}
		
		System.out.printf("The largest number is: %d%n", largest);

	
	}
}
