import java.util.Scanner;

public class TwoPointOneSix{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first integer");
		int numberOne = userInput.nextInt();
		
		System.out.println("Enter the second integer");
		int numberTwo = userInput.nextInt();
		
		if(numberOne == numberTwo){
		System.out.println("These numbers are equal");
		
		if(numberOne > numberTwo){
		System.out.println(numberOne + " is larger");
		}
		
		if(numberTwo > numberOne){
		System.out.println(numberTwo + " is larger");
		}
	}
}
